package org.dao;
import java.util.List;
import org.model.Dlb;
public interface DlDao {
	//�����û�
	public void save(Dlb user);
	//����ѧ�źͿ������
	public Dlb find(String xh,String kl);
	//�Ƿ���ڸ�ѧ�ŵ��û�
	public boolean existXh(String xh);
}
