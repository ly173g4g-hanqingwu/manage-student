package org.service.imp;

import java.util.List;

import org.dao.CjDao;
import org.dao.XsDao;
import org.model.Xsb;
import org.service.XsService;

public class XsServiceManage implements XsService {
	//��XsDao��CjDao��������ע��
	private XsDao xsDao;
	private CjDao cjDao;
	public void setXsDao(XsDao xsDao) {
		this.xsDao = xsDao;
	}
	public void setCjDao(CjDao cjDao) {
		this.cjDao = cjDao;
	}
	public void delete(String xh) {
		//ɾ��ѧ��ʱͬʱҪɾ����Ӧ�ɼ�
		xsDao.delete(xh);
		cjDao.deleteOneXsCj(xh);
	}
	public Xsb find(String xh) {
		return xsDao.find(xh);
	}
	public List findAll(int pageNow, int pageSize) {
		return xsDao.findAll(pageNow, pageSize);
	}
	public int findXsSize() {
		return xsDao.findXsSize();
	}
	public void save(Xsb xs) {
		xsDao.save(xs);
	}
	public void update(Xsb xs) {
		xsDao.update(xs);
	}

	

	
}
