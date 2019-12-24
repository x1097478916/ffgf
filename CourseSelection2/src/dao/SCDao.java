package dao;
import entity.IEntity;
import entity.SC;

import java.util.HashMap;

public class SCDao implements IDao {
	private static SCDao instance;
	private HashMap<String, IEntity> SCs;
	private SC SC;
	private SCDao() {
		SCs = new HashMap<String, IEntity>();
		SC sc= new SC();
		
		sc.setStudentNo("164801001");
		sc.addone("0001",2);
		sc.addone("0002",2);
		SCs.put(sc.getStudentNo(), sc);
	}
	public static SCDao getInstance() {
		if(instance == null) {
			synchronized(SCDao.class) {
				if(instance == null) {
					instance = new SCDao();
					return instance;
				}
			}
		}
		return instance;
	}
	@Override
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
		SC st = (SC)entity;
		SCs.put(st.getStudentNo(), st);
	}

	@Override
	public void delete(String id){
		SCs.remove(id);// TODO Auto-generated method stub

	}

	@Override
	public void update(IEntity entity) {
		SC st = (SC)entity;
		SCs.put(st.getStudentNo(), st);// TODO Auto-generated method stub

	}

	@Override
	public HashMap<String, IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return SCs;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub		
		return SCs.get(Id);
	}


	
	

}
