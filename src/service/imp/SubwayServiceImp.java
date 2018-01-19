package service.imp;

import java.util.ArrayList;

import dao.SubwayInfo;
import dao.imp.SubwayImp;
import entity.Subway;
import service.SubwayService;

public class SubwayServiceImp implements SubwayService {
	private SubwayImp su = new SubwayImp();

	@Override
	public ArrayList<Subway> cx() {
		return su.select();
	}

	@Override
	public int cxname(String name) {
		String name1 = su.selectname(name);
		int n = -1;
		if(name1 != null){
			n = 1;
		}
		return n;
	}


}
