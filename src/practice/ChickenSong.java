package practice;

import java.util.ArrayList;
import java.util.List;

public class ChickenSong implements HenHouse  {
	
	public static void main(String[] args) {
		List<Chicken>list=new ArrayList<>();
		
		
		HenHouse  house = ()->list;
		 Chicken chicken = house.getChickens().get(0);
		 for(int i=0; i<house.getChickens().size();
		 chicken = house.getChickens().get(i++)) {
		 System.out.println("Cluck");
		 } }

	@Override
	public List<Chicken> getChickens() {
		// TODO Auto-generated method stub
		return null;
	} }

