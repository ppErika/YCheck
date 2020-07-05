package com.example.ycheck;

import java.util.HashMap;
import java.util.Map;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;


public class QrCheckRequest extends StringRequest {

    final static private String URL = "http://sep1198.cafe24.com/QrCheck.php";
    private Map<String, String> parameters;

    public QrCheckRequest(String stuId, Response.Listener<String> listener){
        super(Method.POST, URL, listener,null);
        parameters=new HashMap<>();
        parameters.put("stuId", stuId);
    }

    @Override
    public Map<String, String> getParams(){return parameters;}
}