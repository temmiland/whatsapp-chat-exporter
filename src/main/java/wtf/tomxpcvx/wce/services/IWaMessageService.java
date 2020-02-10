package wtf.tomxpcvx.wce.services;

import wtf.tomxpcvx.wce.entities.WaMessage;

import java.util.HashMap;

public interface IWaMessageService {

    public HashMap<Integer, WaMessage> getAllWaMessages();
}