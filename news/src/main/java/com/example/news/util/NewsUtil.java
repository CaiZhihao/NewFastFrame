package com.example.news.util;

/**
 * 项目名称:    NewFastFrame
 * 创建人:        陈锦军
 * 创建时间:    2017/9/17      9:36
 * QQ:             1981367757
 */

public class NewsUtil {
    public static final String CUG_NEWS = "http://www.cug.edu.cn/index/ddyw.htm";
    public static final String CUG_INDEX = "http://www.cug.edu.cn/";
    public static final String CUG_NOTIFY = "http://www.cug.edu.cn/index/tzgg.htm";
    public static final String CUG_TECHNOLOGY="http://www.cug.edu.cn/index/xsdt.htm";
    public static final String URL = "url";
    public static final String TITLE = "title";
    public static final String CUG_LIBRARY="http://202.114.202.207/opac/openlink.php?location=ALL&title=java&doctype=ALL&lang_code=ALL&match_flag=forward&displaypg=20&showmode=list&orderby=DESC&sort=CATA_DATE&onlylendable=no&with_ebook=&page=2";
    public static final String LIBRARY_LOGIN = "http://202.114.202.207/reader/login.php";
    public static final String LIBRARY_PERSON_INFO_URL="http://202.114.202.207/reader/redr_info.php";
    public static final String LIBRARY_BORROW_BOOK_LIST_URL="http://202.114.202.207/reader/book_lst.php";
    public static final String LIBRARY_BORROW_BOOK_HISTORY_LIST_URL="http://202.114.202.207/reader/book_hist.php";
    public static final String LIBRARY_COOKIE = "library_cookie";
    public static final String LIBRARY_BERIFY_IMAGE_URL = "http://202.114.202.207/reader/captcha.php";
    public static final String BASE_URL = "http://202.114.202.207/";


    public static String getRealNewsUrl(int totalPage, int currentNum) {
        if (totalPage > 0) {
            return "http://www.cug.edu.cn/index/ddyw/" + (totalPage - currentNum + 1) + ".htm";
        }
        return CUG_NEWS;
    }



    public static String getSearchLibraryUrl(String text,int page,int num){
        return CUG_LIBRARY.replace("java",text).replace("page=2","page="+page).replace("displaypg=20","displaypg="+num);
    }

    public static String getHref(String href) {
        if (href != null && !href.startsWith("http")) {
            return CUG_INDEX + href;
        }
        return href;
    }

    public static String getRealSearchLibraryUrl(String url) {
        if (url != null && !url.startsWith("http")) {
            return "http://202.114.202.207/opac/"+url;
        }
        return url;
    }

    public static String getVerifyUrl(String account, String password, String verify) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("http://202.114.202.207/reader/redr_verify.php?").append("number=").append(account)
        .append("&").append("passwd=").append(password).append("&")
        .append("captcha=").append(verify).append("&").append("select=cert_no&returnUrl=");
        return stringBuilder.toString();
    }


    public static String getRealBorrowLibraryUrl(String url) {
        if (url != null && !url.startsWith("http")) {
            return "http://202.114.202.207/"+url;
        }
        return url;
    }
}
