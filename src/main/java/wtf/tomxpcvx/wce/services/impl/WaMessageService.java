package wtf.tomxpcvx.wce.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wtf.tomxpcvx.wce.dao.WaMessageDao;
import wtf.tomxpcvx.wce.entities.WaMessage;
import wtf.tomxpcvx.wce.services.IWaMessageService;

import java.util.HashMap;


@Service
public class WaMessageService implements IWaMessageService {

	@Autowired
	private WaMessageDao waMessageDao;
	
	public HashMap<Integer, WaMessage> getAllWaMessages() {
		HashMap waMessages = new HashMap<Integer, WaMessage>();
		waMessageDao.findAll().forEach(waMessage -> waMessages.put(waMessage.getZPk(), waMessage));
	    return waMessages;
	}

}