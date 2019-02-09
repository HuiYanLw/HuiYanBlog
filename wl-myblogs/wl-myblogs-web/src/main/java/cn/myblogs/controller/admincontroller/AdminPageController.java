package cn.myblogs.controller.admincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminPageController {
	@RequestMapping("/baidueditor/ueditor/dialogs/image/image")
	public String Image(){
		return "/adminjsp/imaged";
	}
	@RequestMapping("/baidueditor/ueditor/dialogs/emotion/emotion")
	public String emotion(){
		return "/adminjsp/emotion";
	}
	@RequestMapping("/baidueditor/ueditor/dialogs/music/music")
	public String Music(){
		return "/adminjsp/music";
	}
	@RequestMapping("/baidueditor/ueditor/dialogs/link/link")
	public String Link(){
		return "/adminjsp/link";
	}
	@RequestMapping("/baidueditor/ueditor/dialogs/spechars/spechars")
	public String Spechars(){
		return "/adminjsp/spechars";
	}
	@RequestMapping("/baidueditor/ueditor/dialogs/preview/preview")
	public String Preview(){
		return "/adminjsp/preview";
	}
	@RequestMapping("/baidueditor/ueditor/dialogs/anchor/anchor")
	public String Anchor(){
		return "/adminjsp/anchor";
	}
	@RequestMapping("/baidueditor/ueditor/dialogs/template/template")
	public String Template(){
		return "/adminjsp/template";
	}
	@RequestMapping("/baidueditor/ueditor/dialogs/background/background")
	public String Background(){
		return "/adminjsp/background";
	}
	@RequestMapping("/baidueditor/ueditor/dialogs/video/video")
	public String Video(){
		return "/adminjsp/video";
	}
	
	@RequestMapping("/19970201wl/admin")
	public String test(){
		return "/adminjsp/main";
	}
	@RequestMapping("/19971224wls/addArticle")
	public String addArticle(){
		return "/adminjsp/add-article";
	}
	@RequestMapping("/19971224wls/UpdateArticle/{aId}")
	public String updateArticle(){
		return "/adminjsp/update-article";
	}
	@RequestMapping("/19971224wls/ArticleList")
	public String articleList(){
		return "/adminjsp/articlelist";
	}
	@RequestMapping("/19971224wls/SendWord")
	public String getSendWord(){
		return "/adminjsp/sendword";
	}
	@RequestMapping("/19971224wls/Mood")
	public String getMood(){
		return "/adminjsp/mood";
	}
	@RequestMapping("/19971224wls/AddMood")
	public String getAddMood(){
		return "/adminjsp/add-mood";
	}
	@RequestMapping("/19971224wls/Friendchain")
	public String getFriendchain(){
		return "/adminjsp/friendchain";
	}
	@RequestMapping("/19971224wls/AddFriendchain")
	public String addFriendchain(){
		return "/adminjsp/add-friendchain";
	}
	@RequestMapping("/19971224wls/UpdateFriendchain/{fId}")
	public String updateFriendchain(){
		return "/adminjsp/update-friendchain";
	}
	@RequestMapping("/19971224wls/ClassifyTage")
	public String ClassifyTage(){
		return "/adminjsp/classifytage";
	}
	@RequestMapping("/LoginUser")
	public String LoginUser(){
		return "/adminjsp/login";
	}
}
