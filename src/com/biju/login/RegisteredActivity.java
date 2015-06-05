package com.biju.login;

import java.io.IOException;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;

import com.biju.BaseActivity;
import com.biju.R;

public class RegisteredActivity extends BaseActivity implements OnClickListener {

	private final String IMAGE_TYPE = "image/*";
	private final int IMAGE_CODE = 0; // 这里的IMAGE_CODE是自己任意定义的
	private ImageView registered_head;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registered);
		initUI();
	}

	private void initUI() {
		registered_head = (ImageView) findViewById(R.id.registered_head);
		registered_head.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.registered, menu);
		return true;
	}

	@Override
	public void Response() {

	}

	@Override
	public void ErrorResponse() {

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.registered_head:
			registered_head();
			break;

		default:
			break;
		}
	}
	//打开图库，选择图片
	private void registered_head() {
		// 使用intent调用系统提供的相册功能，使用startActivityForResult是为了获取用户选择的图片
		Intent getAlbum = new Intent(Intent.ACTION_GET_CONTENT);
		getAlbum.setType(IMAGE_TYPE);
		startActivityForResult(getAlbum, IMAGE_CODE);
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode != RESULT_OK) { // 此处的 RESULT_OK 是系统自定义得一个常量
			Log.e("TAG->onresult", "ActivityResult resultCode error");
			return;
		}
		Bitmap bm = null;
		// 外界的程序访问ContentProvider所提供数据 可以通过ContentResolver接口
		ContentResolver resolver = getContentResolver();
		// 此处的用于判断接收的Activity是不是你想要的那个
		if (requestCode == IMAGE_CODE) {
			try {
				Uri originalUri = data.getData(); // 获得图片的uri
				bm = MediaStore.Images.Media.getBitmap(resolver, originalUri);
				// 显得到bitmap图片
				// registered_head.setImageBitmap(bm);
				initHead(bm);// 画圆形头像
				// 这里开始的第二部分，获取图片的路径：
				String[] proj = { MediaStore.Images.Media.DATA };
				// 好像是android多媒体数据库的封装接口，具体的看Android文档
				Cursor cursor = managedQuery(originalUri, proj, null, null,
						null);
				// 按我个人理解 这个是获得用户选择的图片的索引值
				int column_index = cursor
						.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
				// 将光标移至开头 ，这个很重要，不小心很容易引起越界
				cursor.moveToFirst();
				// 最后根据索引值获取图片路径
				String path = cursor.getString(column_index);
				// imgPath.setText(path);
			} catch (IOException e) {
			}
		}
	}
	//对图片进行修改，变成圆形
	private void initHead(Bitmap bm) {
		// 裁剪图片
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true;
		// 此宽度是目标ImageView希望的大小，你可以自定义ImageView，然后获得ImageView的宽度。
		int dstWidth = 150;
		// 我们需要加载的图片可能很大，我们先对原有的图片进行裁剪
		int sampleSize = calculateInSampleSize(options, dstWidth, dstWidth);
		options.inSampleSize = sampleSize;
		options.inJustDecodeBounds = false;
		Bitmap bmp = bm;
		// 绘制图片
		Bitmap resultBmp = Bitmap.createBitmap(dstWidth, dstWidth,
				Bitmap.Config.ARGB_8888);
		Paint paint = new Paint();
		paint.setAntiAlias(true);
		Canvas canvas = new Canvas(resultBmp);
		// 画圆
		canvas.drawCircle(dstWidth / 2, dstWidth / 2, dstWidth / 2, paint);
		// 选择交集去上层图片
		paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
		canvas.drawBitmap(bmp, new Rect(0, 0, bmp.getWidth(), bmp.getWidth()),
				new Rect(0, 0, dstWidth, dstWidth), paint);
		registered_head.setImageBitmap(resultBmp);
		bmp.recycle();
	}

	private int calculateInSampleSize(BitmapFactory.Options options,
			int reqWidth, int reqHeight) {
		final int height = options.outHeight;
		final int width = options.outWidth;
		int inSampleSize = 1;

		if (height > reqHeight || width > reqWidth) {

			final int halfHeight = height / 2;
			final int halfWidth = width / 2;
			while ((halfHeight / inSampleSize) > reqHeight
					&& (halfWidth / inSampleSize) > reqWidth) {
				inSampleSize *= 2;
			}
		}
		return inSampleSize;
	}

}
