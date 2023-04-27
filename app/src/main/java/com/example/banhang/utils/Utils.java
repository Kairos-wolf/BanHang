package com.example.banhang.utils;

import com.example.banhang.model.GioHang;
import com.example.banhang.model.User;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static final String BASE_URL="http://10.50.40.134/banhang/";

    public static List<GioHang> manggiohang;
    public static  List<GioHang> mangmuahang = new ArrayList<>();

    public static User user_current = new User();
}
