package project.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Park;
import project.model.TimeCategory;
import project.model.TimeInPark;
import project.model.dto.TimeInParkDTO;

@Service
public class SystemService {
	
	private final DeSysGeneralService deSysGeneralService;
	
	private HashMap<Park, TimeInPark> times;
	
	@Autowired
	private HostsCatalog hostsCatalog;
	
	@Autowired
	public SystemService(DeSysGeneralService deSysGeneralService) {
		this.times = new HashMap<Park, TimeInPark>();
		this.deSysGeneralService = deSysGeneralService;
	}
	
	public TimeInPark setTime(TimeInParkDTO timeDTO) {
		
		TimeInPark retVal = new TimeInPark();
		
		retVal.setPark(hostsCatalog.checkPark(timeDTO.getPark()));
		retVal.setPart_of_day(checkTimeCategory(timeDTO.getPart_of_day()));
		retVal.setHours(timeDTO.getHours());
		retVal.setMinutes(timeDTO.getMinutes());
		
		if(times.containsKey(retVal.getPark())) {
			times.put(retVal.getPark(), retVal);
		}
		else {
			times.put(retVal.getPark(), retVal);
			deSysGeneralService.setTimeInPark(retVal);
		}
		
		
		
		return retVal;
	}
	
	public TimeCategory checkTimeCategory(String strCategory) {
		TimeCategory retVal = null;
		
		TimeCategory[] categories = TimeCategory.values();
		
		for(TimeCategory category : categories) {
			if(category.name().equals(strCategory)) {
				retVal = category;
				break;
			}
		}
		
		return retVal;
	}

}
