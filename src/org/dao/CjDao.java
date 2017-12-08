package org.dao;
import java.util.List;
import org.model.Cjb;
import org.model.CjbId;
public interface CjDao {
	//����ѧ���ɼ�
	public void saveorupdateCj(Cjb cj);
	//����ѧ�źͿγ̺�ɾ��ѧ���ɼ�
	public void deleteCj(String xh,String kch);
	//����ѧ�źͿγ̺Ų�ѯѧ���ɼ�
	public Cjb getXsCj(String xh,String kch);
	//��ҳ��ʾ����ѧ���ɼ�
	public List findAllCj(int pageNow,int pageSize);
	//��ѯĳѧ���ɼ�
	public List getXsCjList(String xh);
	//��ѯĳ�ǿγ̵�ѧ���ɼ�
	public List getKcCjList(String kch);
	//ɾ��ĳѧ���ĳɼ�
	public void deleteOneXsCj(String xh);
	//ɾ��ĳ�ſγ̵ĳɼ�
	public void deleteOneKcInfo(String kch);
	//��ѯһ���������ɼ���¼
	public int findCjSize();
}
