package com.koreinfotech.sms.streakintegration.api;

import java.util.List;

import com.streakapi.crm.api.IStreakAPI;
import com.streakapi.crm.datatype.Box;
import com.streakapi.crm.exceptions.NoValidObjectsReturned;
import com.streakapi.crm.impl.StreakAPIImpl;

public class IStreakIntegrationAPI {
	public static void main(String[] args){
		String streakKey = "";
		IStreakAPI streakAPI = new StreakAPIImpl(streakKey);
		try {
			List<Box> boxList = streakAPI.getAllBoxes();
			System.out.println("Number of Boxes: " + boxList.size());
		} catch (NoValidObjectsReturned e) {
			e.printStackTrace();
		}
	}
}
