package pra_2019_02_16_02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero[] heros = new Hero[3];
		heros[0] = new warrior("戦士");
		heros[1] = new archer("射手");
		heros[2] = new wizard("魔法使い");
		
		for(int i=0;i<heros.length;i++)
		{
			heros[i].attack();
			if(heros[i] instanceof warrior)   //heros[i]のinstanceがwarriorだったらの意味
			{
				warrior temp = (warrior) heros[i];
				temp.warrior_skill();
			}
			else if(heros[i] instanceof archer)   //heros[i]のinstanceがarcherだったらの意味
			{
				archer temp = (archer) heros[i];
				temp.archer_skill();
			}
			else    							//heros[i]のinstanceがwizardだったらの意味
			{
				wizard temp = (wizard) heros[i];
				temp.wizard_skill();
			}
		}
	}

}
