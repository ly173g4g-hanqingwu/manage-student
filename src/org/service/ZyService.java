package org.service;

import java.util.List;

import org.model.Zyb;

public interface ZyService {
	//����רҵ��Ϣ
	public void save(Zyb zy);
	//����רҵId����רҵ��Ϣ
	public Zyb getOneZy(int zyId);
	//��������רҵ��Ϣ
	public List getAll();
}
