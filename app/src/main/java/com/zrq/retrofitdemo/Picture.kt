package com.zrq.retrofitdemo

data class Picture(val msg: String = "",
                   val res: Res,
                   val code: Int = 0)


data class Res(val category: List<CategoryItem>?)


data class CategoryItem(val picassoCover: String = "",
                        val atime: Double = 0.0,
                        val rname: String = "",
                        val count: Int = 0,
                        val type: Int = 0,
                        val coverTemp: String = "",
                        val cover: String = "",
                        val ename: String = "",
                        val name: String = "",
                        val rank: Int = 0,
                        val icover: String = "",
                        val sn: Int = 0,
                        val id: String = "")