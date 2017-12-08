package org.dao;
import java.util.List;
import org.model.Xsb;
public interface XsDao {
	//����ѧ��
	public void save(Xsb xs);
	//����ѧ��ɾ��ѧ��
	public void delete(String xh);
	//�޸�ѧ����Ϣ
	public void update(Xsb xs);
	//����ѧ�Ų�ѯѧ����Ϣ
	public Xsb find(String xh);
	//��ҳ��ʾѧ����Ϣ
	public List findAll(int pageNow,int pageSize);
	//��ѯһ��������ѧ����¼
	public int findXsSize();
}
