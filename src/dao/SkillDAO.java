package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	@SuppressWarnings("unused")
	public TreeMap<Skill,Integer> skillCount() throws SQLException, Exception{
		ConnectionManager con=new ConnectionManager();
		
		Statement st=ConnectionManager.getConnection().createStatement();
		String quer="Select Skill3_id,Player_id,player_name,player_skills";
		
			st.getConnection().createStatement();
			ResultSet rs=st.executeQuery(quer);
		
		while(rs.next())
		{
			/*String player_skill=rs.getString(0);
			String skillId=rs.getString("skillid");
			int playerId=rs.getInt("playerId");
			String playername=rs.getString("Player Name");
			String playerskill=rs.getString("Player Skills");
			System.out.println(player_skill+"\t"+skillId+"\t"+playerId+"\t"+playername+"\t"+playerskill);*/
			if(rs.getLong(4)>=4) {
				System.out.println("batting"+rs.getLong(4));
			}
			else if(rs.getLong(4)>=3){
				System.out.println("bowling"+rs.getLong(4));
			}
			else {
				System.out.println("wicketkeeping"+rs.getLong(4));
			}
		}
		Skill skill1=Skill("batting");
		Skill skill2=Skill("bowler");
		Skill skill3=Skill("wicketkeeping");
		
		/*catch(SQLException e ) {
			return null;
		} finally {
			if(st!=null) {
				st.close();
			}
		}*/
		return null;
		
		
	}

	private Skill Skill(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
