﻿package bb.model;

import java.util.ArrayList;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bb.activity.R;
import bb.model.Baffle;
import bb.utils.AppStatic;
import bb.view.GameView;

//关卡信息类
public class ChackPoints {
	public Bitmap mapback;  //地图背景图片
	public ArrayList<Bitmap> bmp_arr = new ArrayList<Bitmap>();
	public GameMap gamemap;
	public ArrayList<Baffle> bafflearr = new ArrayList<Baffle>();  //地图挡板数组
	public ArrayList<Monster> monsterarr = new ArrayList<Monster>();  //怪物数组
	public GameView father;
	public int start_x = 0;
	public int start_y = 0;
	
	//初始化关卡
	public ChackPoints(GameView father){
		this.father = father;
		switch(AppStatic.gamemapnum){
		case 0:initMap0();break;
		case 1:initMap1();break;
		case 2:initMap2();break;
		case 3:initMap3();break;
		case 4:initMap4();break;
		case 5:initMap5();break;
		case 6:initMap6();break;
		case 7:initMap7();break;
		case 8:initMap8();break;
		case 9:initMap9();break;
		default:initMap0();break;
		}
	}

	//地图0
	private void initMap0() {
		// TODO Auto-generated method stub
		mapback = BitmapFactory.decodeResource(father.getResources(), R.drawable.gameback); //初始化地图背景图片
		bmp_arr.add(0,BitmapFactory.decodeResource(father.getResources(), R.drawable.land));  //初始化挡板图片
		bafflearr.add(0, new Baffle(1,0, 465, 800, bmp_arr,0,0));
		bafflearr.add(1, new Baffle(1,200, 110, 400, bmp_arr,0,0));
		bafflearr.add(2, new Baffle(1,150, 235, 500, bmp_arr,0,0));
		bafflearr.add(3, new Baffle(1,100, 360, 600, bmp_arr,0,0));
		AppStatic.gamemap = new GameMap(mapback, 0, 0, bafflearr);
		AppStatic.monsterarr.add(0,new Monster(1, 350, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(1,new Monster(1, 400, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(2,new Monster(1, 450, 0, father.monsterarr_p));
		AppStatic.monster_num=3;
	}
	
	//地图1
	private void initMap1() {
		// TODO Auto-generated method stub
		mapback=BitmapFactory.decodeResource(father.getResources(), R.drawable.gameback); //初始化地图背景图片
		bmp_arr.add(0,BitmapFactory.decodeResource(father.getResources(), R.drawable.land));
		bmp_arr.add(1,BitmapFactory.decodeResource(father.getResources(), R.drawable.baffle1));  //初始化挡板图片
		bafflearr.add(0, new Baffle(1, 0, 465, 800, bmp_arr,0,0));
		bafflearr.add(1, new Baffle(1, 120, 110, 530, bmp_arr,0,0));
		bafflearr.add(2, new Baffle(1, 100, 235, 250, bmp_arr,0,0));
		bafflearr.add(3, new Baffle(1, 450, 235, 250, bmp_arr,0,0));
		bafflearr.add(4, new Baffle(4, 300, 360, 300, bmp_arr,80,80));
		AppStatic.gamemap = new GameMap(mapback, 0, 0, bafflearr);
		AppStatic.monsterarr.add(0,new Monster(1, 300, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(1,new Monster(1, 350, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(2,new Monster(2, 400, 0, father.monsterarr_p));
		AppStatic.monster_num=3;
	}
	
	//地图2
	private void initMap2(){
		mapback=BitmapFactory.decodeResource(father.getResources(), R.drawable.gameback); //初始化地图背景图片
		bmp_arr.add(0,BitmapFactory.decodeResource(father.getResources(), R.drawable.land));
		bmp_arr.add(1,BitmapFactory.decodeResource(father.getResources(), R.drawable.baffle1));  //初始化挡板图片
		bafflearr.add(0, new Baffle(1, 0, 465, 800, bmp_arr,0,0));
		bafflearr.add(1, new Baffle(1, 160, 110, 160, bmp_arr,0,0));
		bafflearr.add(2, new Baffle(1, 480, 110, 160, bmp_arr,0,0));
		bafflearr.add(3, new Baffle(1, 160, 360, 160, bmp_arr,0,0));
		bafflearr.add(4, new Baffle(1, 480, 360, 160, bmp_arr,0,0));
		bafflearr.add(5, new Baffle(4, 300, 235, 200, bmp_arr,200,200));
		bafflearr.add(6, new Baffle(2, 160, 110, 150, bmp_arr,0,0));
		bafflearr.add(7, new Baffle(2, 625, 110, 150, bmp_arr,0,0));
		bafflearr.add(8, new Baffle(2, 160, 235, 150, bmp_arr,0,0));
		bafflearr.add(9, new Baffle(2, 625, 235, 150, bmp_arr,0,0));
		AppStatic.gamemap = new GameMap(mapback, 0, 0, bafflearr);  //新建地图
		AppStatic.monsterarr.add(0,new Monster(1, 350, 0, father.monsterarr_p));  //怪物添加
		AppStatic.monsterarr.add(1,new Monster(1, 400, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(2,new Monster(2, 300, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(3,new Monster(2, 450, 0, father.monsterarr_p));
		AppStatic.monster_num=4;
	}
	
	//地图3
	private void initMap3(){
		mapback=BitmapFactory.decodeResource(father.getResources(), R.drawable.gameback); //初始化地图背景图片
		bmp_arr.add(0,BitmapFactory.decodeResource(father.getResources(), R.drawable.land));
		bmp_arr.add(1,BitmapFactory.decodeResource(father.getResources(), R.drawable.baffle1));  //初始化挡板图片
		bafflearr.add(0, new Baffle(1, 0, 465, 800, bmp_arr,0,0));
		bafflearr.add(1, new Baffle(1, 0, 110, 160, bmp_arr,0,0));
		bafflearr.add(2, new Baffle(1, 640, 110, 160, bmp_arr,0,0));
		bafflearr.add(3, new Baffle(1, 160, 235, 160, bmp_arr,0,0));
		bafflearr.add(4, new Baffle(1, 480, 235, 160, bmp_arr,0,0));
		bafflearr.add(5, new Baffle(1, 200, 360, 400, bmp_arr,0,0));
		bafflearr.add(6, new Baffle(2, 145, 110, 150, bmp_arr,0,0));
		bafflearr.add(7, new Baffle(2, 640, 110, 150, bmp_arr,0,0));
		AppStatic.gamemap = new GameMap(mapback, 0, 0, bafflearr);  //新建地图
		AppStatic.monsterarr.add(0,new Monster(1, 350, 0, father.monsterarr_p));  //怪物添加
		AppStatic.monsterarr.add(1,new Monster(1, 400, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(2,new Monster(2, 450, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(3,new Monster(2, 300, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(4,new Monster(3, 550, 0, father.monsterarr_p));
		AppStatic.monster_num=5;
	}
	
	//地图4
	private void initMap4(){
		mapback=BitmapFactory.decodeResource(father.getResources(), R.drawable.gameback); //初始化地图背景图片
		bmp_arr.add(0,BitmapFactory.decodeResource(father.getResources(), R.drawable.land));
		bmp_arr.add(1,BitmapFactory.decodeResource(father.getResources(), R.drawable.baffle1));  //初始化挡板图片
		bafflearr.add(0, new Baffle(1, 0, 465, 800, bmp_arr,0,0));
		bafflearr.add(1, new Baffle(4, 0, 110, 160, bmp_arr,0,495));
		bafflearr.add(2, new Baffle(4, 640, 110, 160, bmp_arr,495,0));
		bafflearr.add(3, new Baffle(1, 160, 235, 160, bmp_arr,0,0));
		bafflearr.add(4, new Baffle(1, 480, 235, 160, bmp_arr,0,0));
		bafflearr.add(5, new Baffle(1, 200, 360, 400, bmp_arr,0,0));
		bafflearr.add(6, new Baffle(2, 145, 110, 150, bmp_arr,0,0));
		bafflearr.add(7, new Baffle(2, 640, 110, 150, bmp_arr,0,0));
		AppStatic.gamemap = new GameMap(mapback, 0, 0, bafflearr);  //新建地图
		AppStatic.monsterarr.add(0,new Monster(0, 350, 0, father.monsterarr_p));  //怪物添加
		AppStatic.monsterarr.add(1,new Monster(1, 400, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(2,new Monster(2, 450, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(3,new Monster(3, 300, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(4,new Monster(4, 550, 0, father.monsterarr_p));
		AppStatic.monster_num=5;
	}
	
	//地图5
	private void initMap5(){
		mapback=BitmapFactory.decodeResource(father.getResources(), R.drawable.gameback); //初始化地图背景图片
		bmp_arr.add(0,BitmapFactory.decodeResource(father.getResources(), R.drawable.land));
		bmp_arr.add(1,BitmapFactory.decodeResource(father.getResources(), R.drawable.baffle1));  //初始化挡板图片
		bmp_arr.add(2,BitmapFactory.decodeResource(father.getResources(), R.drawable.water));
		bafflearr.add(0, new Baffle(3, 0, 465, 800, bmp_arr,0,0));
		bafflearr.add(1, new Baffle(4, 0, 110, 160, bmp_arr,0,495));
		bafflearr.add(2, new Baffle(4, 640, 110, 160, bmp_arr,495,0));
		bafflearr.add(3, new Baffle(4, 320, 110, 160, bmp_arr,200,200));
		bafflearr.add(4, new Baffle(1, 250, 235, 300, bmp_arr,0,0));
		bafflearr.add(5, new Baffle(4, 0, 360, 160, bmp_arr,0,495));
		bafflearr.add(6, new Baffle(4, 640, 360, 160, bmp_arr,495,0));
		bafflearr.add(7, new Baffle(4, 320, 360, 160, bmp_arr,200,200));
		AppStatic.gamemap = new GameMap(mapback, 0, 0, bafflearr);  //新建地图
		AppStatic.monsterarr.add(0,new Monster(0, 350, 0, father.monsterarr_p));  //怪物添加
		AppStatic.monsterarr.add(1,new Monster(1, 400, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(2,new Monster(2, 450, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(3,new Monster(3, 300, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(4,new Monster(4, 550, 0, father.monsterarr_p));
		AppStatic.monster_num=5;
	}
	
	//地图6
	private void initMap6(){
		mapback=BitmapFactory.decodeResource(father.getResources(), R.drawable.gameback); //初始化地图背景图片
		bmp_arr.add(0,BitmapFactory.decodeResource(father.getResources(), R.drawable.land));
		bmp_arr.add(1,BitmapFactory.decodeResource(father.getResources(), R.drawable.baffle1));  //初始化挡板图片
		bmp_arr.add(2,BitmapFactory.decodeResource(father.getResources(), R.drawable.water));
		bafflearr.add(0, new Baffle(1, 0, 465, 270, bmp_arr,0,0));
		bafflearr.add(1, new Baffle(1, 530, 465, 270, bmp_arr,0,0));
		bafflearr.add(2, new Baffle(1, 0, 110, 160, bmp_arr,0,0));
		bafflearr.add(3, new Baffle(1, 480, 110, 160, bmp_arr,0,0));
		bafflearr.add(4, new Baffle(4, 310, 110, 180, bmp_arr,160,320));
		bafflearr.add(5, new Baffle(1, 160, 235, 480, bmp_arr,0,0));
		bafflearr.add(6, new Baffle(2, 145, 110, 150, bmp_arr,0,0));
		bafflearr.add(7, new Baffle(2, 625, 110, 150, bmp_arr,0,0));
		bafflearr.add(8, new Baffle(1, 160, 360, 480, bmp_arr,0,0));
		AppStatic.gamemap = new GameMap(mapback, 0, 0, bafflearr);  //新建地图
		AppStatic.monsterarr.add(0,new Monster(0, 350, 0, father.monsterarr_p));  //怪物添加
		AppStatic.monsterarr.add(1,new Monster(1, 400, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(2,new Monster(2, 450, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(3,new Monster(3, 300, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(4,new Monster(4, 550, 0, father.monsterarr_p));
		AppStatic.monster_num=5;
	}
	
	//地图7
	private void initMap7(){
		mapback=BitmapFactory.decodeResource(father.getResources(), R.drawable.gameback); //初始化地图背景图片
		bmp_arr.add(0,BitmapFactory.decodeResource(father.getResources(), R.drawable.land));
		bmp_arr.add(1,BitmapFactory.decodeResource(father.getResources(), R.drawable.baffle1));  //初始化挡板图片
		bmp_arr.add(2,BitmapFactory.decodeResource(father.getResources(), R.drawable.water));
		bafflearr.add(0, new Baffle(1, 160, 465, 480, bmp_arr,0,0));
		bafflearr.add(1, new Baffle(1, 0, 110, 160, bmp_arr,0,0));
		bafflearr.add(2, new Baffle(1, 320, 110, 160, bmp_arr,0,0));
		bafflearr.add(3, new Baffle(1, 640, 110, 160, bmp_arr,0,0));
		bafflearr.add(4, new Baffle(1, 0, 235, 160, bmp_arr,0,0));
		bafflearr.add(5, new Baffle(1, 320, 235, 160, bmp_arr,0,0));
		bafflearr.add(6, new Baffle(1, 640, 235, 160, bmp_arr,0,0));
		bafflearr.add(7, new Baffle(1, 0, 360, 160, bmp_arr,0,0));
		bafflearr.add(8, new Baffle(1, 320, 360, 160, bmp_arr,0,0));
		bafflearr.add(9, new Baffle(1, 640, 360, 160, bmp_arr,0,0));
		bafflearr.add(10, new Baffle(2, 145, 110, 150, bmp_arr,0,0));
		bafflearr.add(11, new Baffle(2, 320, 110, 150, bmp_arr,0,0));
		bafflearr.add(12, new Baffle(2, 465, 110, 150, bmp_arr,0,0));
		bafflearr.add(13, new Baffle(2, 640, 110, 150, bmp_arr,0,0));
		AppStatic.gamemap = new GameMap(mapback, 0, 0, bafflearr);  //新建地图
		AppStatic.monsterarr.add(0,new Monster(0, 350, 0, father.monsterarr_p));  //怪物添加
		AppStatic.monsterarr.add(1,new Monster(1, 400, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(2,new Monster(2, 450, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(3,new Monster(3, 300, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(4,new Monster(4, 550, 0, father.monsterarr_p));
		AppStatic.monster_num=5;
	}
	
	//地图8
	private void initMap8(){
		mapback=BitmapFactory.decodeResource(father.getResources(), R.drawable.gameback); //初始化地图背景图片
		bmp_arr.add(0,BitmapFactory.decodeResource(father.getResources(), R.drawable.land));
		bmp_arr.add(1,BitmapFactory.decodeResource(father.getResources(), R.drawable.baffle1));  //初始化挡板图片
		bmp_arr.add(2,BitmapFactory.decodeResource(father.getResources(), R.drawable.water));
		bafflearr.add(0, new Baffle(1, 160, 465, 160, bmp_arr,0,0));
		bafflearr.add(1, new Baffle(1, 480, 465, 160, bmp_arr,0,0));
		bafflearr.add(2, new Baffle(1, 160, 110, 500, bmp_arr,0,0));
		bafflearr.add(3, new Baffle(1, 0, 235, 160, bmp_arr,0,0));
		bafflearr.add(4, new Baffle(4, 320, 235, 160, bmp_arr,160,160));
		bafflearr.add(5, new Baffle(1, 640, 235, 160, bmp_arr,0,0));
		bafflearr.add(6, new Baffle(1, 120, 360, 220, bmp_arr,0,0));
		bafflearr.add(7, new Baffle(1, 440, 360, 220, bmp_arr,0,0));
		bafflearr.add(8, new Baffle(2, 160, 0, 135, bmp_arr,0,0));
		bafflearr.add(9, new Baffle(3, 320, 465, 160, bmp_arr,0,0));
		AppStatic.gamemap = new GameMap(mapback, 0, 0, bafflearr);  //新建地图
		AppStatic.monsterarr.add(0,new Monster(0, 350, 0, father.monsterarr_p));  //怪物添加
		AppStatic.monsterarr.add(1,new Monster(1, 400, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(2,new Monster(2, 450, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(3,new Monster(3, 300, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(4,new Monster(4, 550, 0, father.monsterarr_p));
		AppStatic.monster_num=5;
	}
	
	//地图9
	private void initMap9(){
		mapback=BitmapFactory.decodeResource(father.getResources(), R.drawable.gameback); //初始化地图背景图片
		bmp_arr.add(0,BitmapFactory.decodeResource(father.getResources(), R.drawable.land));
		bmp_arr.add(1,BitmapFactory.decodeResource(father.getResources(), R.drawable.baffle1));  //初始化挡板图片
		bmp_arr.add(2,BitmapFactory.decodeResource(father.getResources(), R.drawable.water));
		bafflearr.add(0, new Baffle(4, 0, 110, 160, bmp_arr,0,480));
		bafflearr.add(1, new Baffle(1,320,110, 160, bmp_arr,0,0));
		bafflearr.add(2, new Baffle(4,480,110, 160, bmp_arr,480,0));
		bafflearr.add(3, new Baffle(4,240,235, 320, bmp_arr,80,80));
		bafflearr.add(4, new Baffle(4,0,360, 160, bmp_arr,0,480));
		bafflearr.add(5, new Baffle(4,640,360, 160, bmp_arr,480,0));
		bafflearr.add(6, new Baffle(3,0,465,320, bmp_arr,0,0));
		bafflearr.add(7, new Baffle(3,480,465,320, bmp_arr,0,0));
		AppStatic.gamemap = new GameMap(mapback, 0, 0, bafflearr);  //新建地图
		AppStatic.monsterarr.add(0,new Monster(1, 350, 0, father.monsterarr_p));  //怪物添加
		AppStatic.monsterarr.add(1,new Monster(1, 400, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(2,new Monster(2, 450, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(3,new Monster(3, 300, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(4,new Monster(2, 550, 0, father.monsterarr_p));
		AppStatic.monsterarr.add(4,new Monster(3, 650, 0, father.monsterarr_p));
		AppStatic.monster_num=6;
	}
	
}
