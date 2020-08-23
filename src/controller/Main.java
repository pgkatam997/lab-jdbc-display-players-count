package controller;

import java.sql.SQLException;
import java.util.Map.Entry;
import java.util.TreeMap;
import dao.SkillDAO;
import model.Skill;


public class Main{
	@SuppressWarnings("unused")
	public static void main(String argu[]) throws SQLException, Exception {
		SkillDAO skillado=new SkillDAO();
		Skill skill=new Skill();
		
		TreeMap<Skill,Integer> tm=new TreeMap<Skill,Integer>();
		
		tm=skillado.skillCount();
		
		for(Entry<Skill, Integer> out:tm.entrySet()) {
			Skill skillId=out.getKey();
			Integer skill1=out.getValue();
			System.out.println("Skill ID");
			String skillid=skill.getSkillId();
		}
	
		
		System.out.println("Player ID");
		System.out.println("Player Name");
		System.out.println("Player Skills");
		
	}
}
