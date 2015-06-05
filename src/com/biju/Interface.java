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
	
	//ע���û�
	String kRegAccount =  "11";
	//����ǳ��ظ�
	String kCheckNickname =  "111";
	//�û���¼
	String kUserLgin =  "12";
	//�����û�������
	String kUpdateUser =  "15";
	//��ȡ�û�������
	String kReadUser =  "17";
	//���������������֤��
	String kRequestVerCode= "18";
	//�����ֻ��Ż����˻�ID�����û�
	String kFindUser= "19";
	//�½�С��
	String kCreateGroup= "31";
	//��ȡ�û�С����Ϣ
	String kReadGroupMsg= "32";
	//��ȡ�û�С���ϵ
	String kReadGroupRelation= "33";
	//�����û�С������
	String kUpdateGroupSet= "34";
	//��ȡ����С���Ա�Ĺ�ϵ
	String kReadAllPerRelation= "36";
	//����������
	String kProduceRequestCode="37";
	//ʹ�����������С��
	String kUseRequestCode2join = "38";
	//�û�����С��
	String kUserJoin2gourp= "39";
	//��ȡ�û����оۻ�
	String kReadUserAllParty= "41";
	//��ȡ�û���С���е����оۻ�
	String kReadUserGroupParty= "43";
	//�����û����ھۻ�Ĳ�����Ϣ
	String kUpdateUserJoinMsg= "45";
	//�û�ȡ���ۻ�
	String kUserCancleParty= "46";
	//���Ӿۻ�
	String kAddParty= "47";
	//��ȡ�ۻ��û��Ĳ�����Ϣ
	String kReadPartyJoinMsg= "48";
	//����һ���µľۻ��ϵ
	String kCreatePartyRelation= "49";
	//���һ����������
	String kAddChatData= "52";
	//��ȡС������
	String kReadPartyPhotos= "61";
	//�û��ϴ�ͼƬ
	String kUploadingPhoto= "62";
	//�û�ɾ��ͼƬ
	String kDeletePhoto= "63";
	//��Ӻ��ѹ�ϵ
	String kAddfriend= "71";
	//��ȡ���ѹ�ϵ
	String kReadfriend= "72";
	//ƥ��ͨѶ¼
	String kMateComBook= "73";
	//��Ϊ���ѹ�ϵ
	String kBecomeFriend= "74";
	//�����ѹ�ϵ
	String kCheckFriend= "75";
	//������ѹ�ϵ
	String kReleaseFriend= "76";
	//����һ��˽����Ϣ
	String kAddChatMsg= "81";
	//����
	String kFeedBack= "91";
	//��ȡͼƬǩ��
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
	 //����
	public void testIf(Context context) {
		
		Map<String, String> testMap = new HashMap<String, String>();
		testMap.put("name", "jim");
		JSONObject jsonObject=new JSONObject(testMap);
		
		Map<String, String> per =  new HashMap<String, String>();
		per.put("request_data", jsonObject.toString());
		per.put("request_type", kTestInterface);
		
		volleyPost(context,per);
	}
	//ע�����û�
	public void regNewAccount(Context context,User user) {
		volleyPost(context,packParams(user, kRegAccount));
	}
	//����ǳ��ظ�
	public void checkNickname(Context context,User user) {
		volleyPost(context,packParams(user, kCheckNickname));
	}
	//�û���¼
	public void userLogin(Context context,User user) {
		volleyPost(context,packParams(user, kUserLgin));
	}
	//�����û�������
	public void updateUser(Context context,User user) {
		volleyPost(context,packParams(user, kUpdateUser));
	}
	//��ȡ�û�������
	public void readUser(Context context,User user) {
		volleyPost(context,packParams(user, kReadUser));
	}
	//���������������֤��
	public void requestVerCode(Context context,User user) {//����Ϊ??
		volleyPost(context,packParams(user, kRequestVerCode));
	}
	//�����ֻ��Ż����˻�ID�����û�
	public void findUser(Context context,User user) {
		volleyPost(context,packParams(user, kFindUser));
	}
	//�½�С��
	public void createGroup(Context context,User user) {
		volleyPost(context,packParams(user, kCreateGroup));
	}
	//��ȡ�û�С����Ϣ
	public void readUserGroupMsg(Context context,User user) {
		volleyPost(context,packParams(user, kReadGroupMsg));
	}
	
	//��ȡ�û�С���ϵ
	public void readUserGroupRelation(Context context,Group_User group_User) {
		volleyPost(context,packParams(group_User, kReadGroupRelation));
	}
	//�����û�С������
	public void updateGroupSet(Context context,Group_User group_User) {
		volleyPost(context,packParams(group_User, kUpdateGroupSet));
	}
	//��ȡ����С���Ա�Ĺ�ϵ
	public void readAllPerRelation(Context context,Group group) {
		volleyPost(context,packParams(group, kReadAllPerRelation));
	}
	//����������
	public void produceRequestCode(Context context,Group group) {
		volleyPost(context,packParams(group, kReadAllPerRelation));
	}
	//ʹ�����������С��
	public void useRequestCode2Join(Context context,Group group) {//group_code?
		volleyPost(context,packParams(group, kUseRequestCode2join));
	}
	//�û�����С��
	public void userJoin2gourp(Context context,Group_User group_User) {
		volleyPost(context,packParams(group_User, kUserJoin2gourp));
	}
	//��ȡ�û����оۻ�
	public void readUserAllParty(Context context,User user) {
		volleyPost(context,packParams(user, kReadUserAllParty));
	}
	//��ȡ�û���С���е����оۻ�
	public void readUserGroupParty(Context context,User user) {//���룿��
		volleyPost(context,packParams(user, kReadUserGroupParty));
	}
	//�����û����ھۻ�Ĳ�����Ϣ
	public void updateUserJoinMsg(Context context,Party_User party_User) {
		volleyPost(context,packParams(party_User, kUpdateUserJoinMsg));
	}
	//�û�ȡ���ۻ�
	public void userCancleParty(Context context,Party party) {
		volleyPost(context,packParams(party, kUserCancleParty));
	}
	//���Ӿۻ�
	public void addParty(Context context,Party party) {
		volleyPost(context,packParams(party, kAddParty));
	}
	//��ȡ�ۻ��û��Ĳ�����Ϣ
	public void readPartyJoinMsg(Context context,Party party) {
		volleyPost(context,packParams(party, kReadPartyJoinMsg));
	}
	//����һ���µľۻ��ϵ
	public void createPartyRelation(Context context,Party_User party_User) {
		volleyPost(context,packParams(party_User, kCreatePartyRelation));
	}
	//���һ����������
	public void addChatdata(Context context,Chat chat) {
		volleyPost(context,packParams(chat, kAddChatData));
	}
	//��ȡС������
	public void readPartyPhotos(Context context,Group group) {
		volleyPost(context,packParams(group, kReadPartyPhotos));
	}
	//�û��ϴ�ͼƬ
	public void uploadingPhoto(Context context,Photo photo) {
		volleyPost(context,packParams(photo, kUploadingPhoto));
	}
	//�û�ɾ��ͼƬ
	public void deletePhoto(Context context,Photo photo) {
		volleyPost(context,packParams(photo, kDeletePhoto));
	}
	//��Ӻ��ѹ�ϵ
	public void addFriend(Context context,User_User user_User) {
		volleyPost(context,packParams(user_User, kAddfriend));
	}
	//��ȡ���ѹ�ϵ
	public void readFriend(Context context,User user) {
		volleyPost(context,packParams(user, kReadfriend));
	}
	//ƥ��ͨѶ¼
	public void mateComBook(Context context,User user) {  //���룿����
		volleyPost(context,packParams(user, kMateComBook));
	}
	//��Ϊ���ѹ�ϵ
	public void becomeFriend(Context context,User_User user_User) {  
		volleyPost(context,packParams(user_User, kBecomeFriend));
	}
	//�����ѹ�ϵ
	public void checkFriend(Context context,User_User user_User) {  
		volleyPost(context,packParams(user_User, kCheckFriend));
	}
	//������ѹ�ϵ
	public void releaseFriend(Context context,User_User user_User) {  
		volleyPost(context,packParams(user_User, kReleaseFriend));
	}
	//����һ��˽����Ϣ
	public void addChatMsg(Context context,User_Chat user_Chat) {  
		volleyPost(context,packParams(user_Chat, kAddChatMsg));
	}
	//����
	public void feedBack(Context context,FeedBack feedBack) {  
		volleyPost(context,packParams(feedBack, kFeedBack));
	}
	//��ȡͼƬǩ��
	public void getPicSign(Context context,FeedBack feedBack) {  //���룿��������
		volleyPost(context,packParams(feedBack, kGetPictureSign));
	}
}
