package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("===hello=zhengjie==\n\n");
        //发送 GET 请求
        String s=HttpRequest.sendGet("http://139.196.115.69:20334/api/v1/node/connectioncount", "key=123&v=456");
        System.out.println(s);

        //发送 POST 请求
       String sr=HttpRequest.sendPost("http://139.196.115.69:20334/api/v1/transaction?access_token=b73e1d242991c7a32ba77b7e19c7140f", "key=123&v=456");
        System.out.println(sr);
    }
}
