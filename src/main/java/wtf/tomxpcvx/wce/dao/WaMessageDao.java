package wtf.tomxpcvx.wce.dao;

import org.springframework.data.repository.CrudRepository;

import wtf.tomxpcvx.wce.entities.WaMessage;

public interface WaMessageDao extends CrudRepository<WaMessage, Long> {

}