package dao;

import java.util.ArrayList;

import entity.Subway;

public interface SubwayInfo {
	
	public ArrayList<Subway> select();
	public String selectname(String name);
}
