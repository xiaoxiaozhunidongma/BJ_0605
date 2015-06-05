package com.biju;

import java.security.acl.Group;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import android.content.Context;
import android.provider.ContactsContract.CommonDataKinds.Photo;
import android.util.Log;

import com.BJ.javabean.Chat;
import com.BJ.javabean.FeedBack;
import com.BJ.javabean.Group_User;
import com.BJ.javabean.Party;
import com.BJ.javabean.Party_User;
import com.BJ.javabean.User;
import com.BJ.javabean.User_Chat;
import com.BJ.javabean.User_User;
import com.BJ.utils.Bean2Map;
import com.android.volley.VolleyError;
import com.github.volley_examples.app.MyVolley;
import com.github.volley_examples.app.VolleyListenner;



public class Interface {
	
	String url="http://120.25.218.3/webroot/sr_interface_android.php";
	
	//注册用户
	String kRegAccount =  "11";
	//检查昵称重复
	String kCheckNickname =  "111";
	//用户登录
	String kUserLgin =  "12";
	//更新用户的资料
	String kUpdateUser =  "15";
	//读取用户的资料
	String kReadUser =  "17";
	//请求服务器发送验证码
	String kRequestVerCode= "18";
	//根据手机号或者账户ID查找用户
	String kFindUser= "19";
	//新建小组
	String kCreateGroup= "31";
	//读取用户小组信息
	String kReadGroupMsg= "32";
	//读取用户小组关系
	String kReadGroupRelation= "33";
	//更新用户小组设置
	String kUpdateGroupSet= "34";
	//读取所有小组成员的关系
	String kReadAllPerRelation= "36";
	//生成邀请码
	String kProduceRequestCode="37";
	//使用邀请码加入小组
	String kUseRequestCode2join = "38";
	//用户加入小组
	String kUserJoin2gourp= "39";
	//读取用户所有聚会
	String kReadUserAllParty= "41";
	//读取用户在小组中的所有聚会
	String kReadUserGroupParty= "43";
	//更新用户对于聚会的参与信息
	String kUpdateUserJoinMsg= "45";
	//用户取消聚会
	String kUserCancleParty= "46";
	//增加聚会
	String kAddParty= "47";
	//读取聚会用户的参与信息
	String kReadPartyJoinMsg= "48";
	//建立一条新的聚会关系
	String kCreatePartyRelation= "49";
	//添加一条聊天数据
	String kAddChatData= "52";
	//读取小组的相册
	String kReadPartyPhotos= "61";
	//用户上传图片
	String kUploadingPhoto= "62";
	//用户删除图片
	String kDeletePhoto= "63";
	//添加好友关系
	String kAddfriend= "71";
	//读取好友关系
	String kReadfriend= "72";
	//匹配通讯录
	String kMateComBook= "73";
	//成为好友关系
	String kBecomeFriend= "74";
	//检查好友关系
	String kCheckFriend= "75";
	//解除好友关系
	String kReleaseFriend= "76";
	//增加一条私聊信息
	String kAddChatMsg= "81";
	//反馈
	String kFeedBack= "91";
	//获取图片签名
	String kGetPictureSign= "101";
	
	
	//test
	String kTestInterface =  "1101";


	public static void requestDone(Object theObject) {

	}
	
	public static void requestError(VolleyError error) {
	
	}
	
	public Map<String, String> packParams(Object classObject , String interfaceType) {
		Map map = Bean2Map.ConvertObjToMap(classObject);
		JSONObject jsonObject=new JSONObject(map);
		Map<String, String> params=new HashMap<String, String>();

		params.put("request_type", interfaceType);
		params.put("request_data",jsonObject.toString());
		
		return params;
	}
	
	public void volleyPost(Context context,Map<String, String> params) {
		
		MyVolley.post(context, url, params, new VolleyListenner() {

			@Override
			public void onErrorResponse(VolleyError error) {
				requestError(error);
			}
			@Override
			public void onResponse(String response) {
				requestDone(response);
				Log.e("", response );
			}
		});	
	}
	 //测试
	public void testIf(Context context) {
		
		Map<String, String> testMap = new HashMap<String, String>();
		testMap.put("name", "jim");
		JSONObject jsonObject=new JSONObject(testMap);
		
		Map<String, String> per =  new HashMap<String, String>();
		per.put("request_data", jsonObject.toString());
		per.put("request_type", kTestInterface);
		
		volleyPost(context,per);
	}
	//注册新用户
	public void regNewAccount(Context context,User user) {
		volleyPost(context,packParams(user, kRegAccount));
	}
	//检查昵称重复
	public void checkNickname(Context context,User user) {
		volleyPost(context,packParams(user, kCheckNickname));
	}
	//用户登录
	public void userLogin(Context context,User user) {
		volleyPost(context,packParams(user, kUserLgin));
	}
	//更新用户的资料
	public void updateUser(Context context,User user) {
		volleyPost(context,packParams(user, kUpdateUser));
	}
	//读取用户的资料
	public void readUser(Context context,User user) {
		volleyPost(context,packParams(user, kReadUser));
	}
	//请求服务器发送验证码
	public void requestVerCode(Context context,User user) {//传入为??
		volleyPost(context,packParams(user, kRequestVerCode));
	}
	//根据手机号或者账户ID查找用户
	public void findUser(Context context,User user) {
		volleyPost(context,packParams(user, kFindUser));
	}
	//新建小组
	public void createGroup(Context context,User user) {
		volleyPost(context,packParams(user, kCreateGroup));
	}
	//读取用户小组信息
	public void readUserGroupMsg(Context context,User user) {
		volleyPost(context,packParams(user, kReadGroupMsg));
	}
	
	//读取用户小组关系
	public void readUserGroupRelation(Context context,Group_User group_User) {
		volleyPost(context,packParams(group_User, kReadGroupRelation));
	}
	//更新用户小组设置
	public void updateGroupSet(Context context,Group_User group_User) {
		volleyPost(context,packParams(group_User, kUpdateGroupSet));
	}
	//读取所有小组成员的关系
	public void readAllPerRelation(Context context,Group group) {
		volleyPost(context,packParams(group, kReadAllPerRelation));
	}
	//生成邀请码
	public void produceRequestCode(Context context,Group group) {
		volleyPost(context,packParams(group, kReadAllPerRelation));
	}
	//使用邀请码加入小组
	public void useRequestCode2Join(Context context,Group group) {//group_code?
		volleyPost(context,packParams(group, kUseRequestCode2join));
	}
	//用户加入小组
	public void userJoin2gourp(Context context,Group_User group_User) {
		volleyPost(context,packParams(group_User, kUserJoin2gourp));
	}
	//读取用户所有聚会
	public void readUserAllParty(Context context,User user) {
		volleyPost(context,packParams(user, kReadUserAllParty));
	}
	//读取用户在小组中的所有聚会
	public void readUserGroupParty(Context context,User user) {//传入？？
		volleyPost(context,packParams(user, kReadUserGroupParty));
	}
	//更新用户对于聚会的参与信息
	public void updateUserJoinMsg(Context context,Party_User party_User) {
		volleyPost(context,packParams(party_User, kUpdateUserJoinMsg));
	}
	//用户取消聚会
	public void userCancleParty(Context context,Party party) {
		volleyPost(context,packParams(party, kUserCancleParty));
	}
	//增加聚会
	public void addParty(Context context,Party party) {
		volleyPost(context,packParams(party, kAddParty));
	}
	//读取聚会用户的参与信息
	public void readPartyJoinMsg(Context context,Party party) {
		volleyPost(context,packParams(party, kReadPartyJoinMsg));
	}
	//建立一条新的聚会关系
	public void createPartyRelation(Context context,Party_User party_User) {
		volleyPost(context,packParams(party_User, kCreatePartyRelation));
	}
	//添加一条聊天数据
	public void addChatdata(Context context,Chat chat) {
		volleyPost(context,packParams(chat, kAddChatData));
	}
	//读取小组的相册
	public void readPartyPhotos(Context context,Group group) {
		volleyPost(context,packParams(group, kReadPartyPhotos));
	}
	//用户上传图片
	public void uploadingPhoto(Context context,Photo photo) {
		volleyPost(context,packParams(photo, kUploadingPhoto));
	}
	//用户删除图片
	public void deletePhoto(Context context,Photo photo) {
		volleyPost(context,packParams(photo, kDeletePhoto));
	}
	//添加好友关系
	public void addFriend(Context context,User_User user_User) {
		volleyPost(context,packParams(user_User, kAddfriend));
	}
	//读取好友关系
	public void readFriend(Context context,User user) {
		volleyPost(context,packParams(user, kReadfriend));
	}
	//匹配通讯录
	public void mateComBook(Context context,User user) {  //传入？？？
		volleyPost(context,packParams(user, kMateComBook));
	}
	//成为好友关系
	public void becomeFriend(Context context,User_User user_User) {  
		volleyPost(context,packParams(user_User, kBecomeFriend));
	}
	//检查好友关系
	public void checkFriend(Context context,User_User user_User) {  
		volleyPost(context,packParams(user_User, kCheckFriend));
	}
	//解除好友关系
	public void releaseFriend(Context context,User_User user_User) {  
		volleyPost(context,packParams(user_User, kReleaseFriend));
	}
	//增加一条私聊信息
	public void addChatMsg(Context context,User_Chat user_Chat) {  
		volleyPost(context,packParams(user_Chat, kAddChatMsg));
	}
	//反馈
	public void feedBack(Context context,FeedBack feedBack) {  
		volleyPost(context,packParams(feedBack, kFeedBack));
	}
	//获取图片签名
	public void getPicSign(Context context,FeedBack feedBack) {  //传入？？？？？
		volleyPost(context,packParams(feedBack, kGetPictureSign));
	}
}
