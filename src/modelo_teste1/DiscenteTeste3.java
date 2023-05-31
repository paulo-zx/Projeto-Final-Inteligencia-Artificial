package modelo_teste1;


import modelo_teste1.CSP;
import modelo_teste1.Domain;
import modelo_teste1.Variable;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class DiscenteTeste3 extends CSP<Variable, String>{
	
	public static final String Seg_13 = "Seg_13";
	public static final String Seg_14 = "Seg_14";
	public static final String Seg_15 = "Seg_15";
	public static final String Seg_16 = "Seg_16";
	public static final String Seg_17 = "Seg_17";
	public static final String Seg_18 = "Seg_18";
	public static final String Seg_19 = "Seg_19";
	public static final String Seg_20 = "Seg_20";
	public static final String Seg_21 = "Seg_21";
	public static final String Seg_22 = "Seg_22";
	
	public static final String Ter_13 = "Ter_13";
	public static final String Ter_14 = "Ter_14";
	public static final String Ter_15 = "Ter_15";
	public static final String Ter_16 = "Ter_16";
	public static final String Ter_17 = "Ter_17";
	public static final String Ter_18 = "Ter_18";
	public static final String Ter_19 = "Ter_19";
	public static final String Ter_20 = "Ter_20";
	public static final String Ter_21 = "Ter_21";
	public static final String Ter_22 = "Ter_22";
	
	public static final String Qua_13 = "Qua_13";
	public static final String Qua_14 = "Qua_14";
	public static final String Qua_15 = "Qua_15";
	public static final String Qua_16 = "Qua_16";
	public static final String Qua_17 = "Qua_17";
	public static final String Qua_18 = "Qua_18";
	public static final String Qua_19 = "Qua_19";
	public static final String Qua_20 = "Qua_20";
	public static final String Qua_21 = "Qua_21";
	public static final String Qua_22 = "Qua_22";
	
	public static final String Qui_13 = "Qui_13";
	public static final String Qui_14 = "Qui_14";
	public static final String Qui_15 = "Qui_15";
	public static final String Qui_16 = "Qui_16";
	public static final String Qui_17 = "Qui_17";
	public static final String Qui_18 = "Qui_18";
	public static final String Qui_19 = "Qui_19";
	public static final String Qui_20 = "Qui_20";
	public static final String Qui_21 = "Qui_21";
	public static final String Qui_22 = "Qui_22";
	
	public static final String Sex_13 = "Sex_13";
	public static final String Sex_14 = "Sex_14";
	public static final String Sex_15 = "Sex_15";
	public static final String Sex_16 = "Sex_16";
	public static final String Sex_17 = "Sex_17";
	public static final String Sex_18 = "Sex_18";
	public static final String Sex_19 = "Sex_19";
	public static final String Sex_20 = "Sex_20";
	public static final String Sex_21 = "Sex_21";
	public static final String Sex_22 = "Sex_22";
	
	public static final String Sab_13 = "Sab_13";
	public static final String Sab_14 = "Sab_14";
	public static final String Sab_15 = "Sab_15";
	public static final String Sab_16 = "Sab_16";
	public static final String Sab_17 = "Sab_17";
	public static final String Sab_18 = "Sab_18";
	public static final String Sab_19 = "Sab_19";
	public static final String Sab_20 = "Sab_20";
	public static final String Sab_21 = "Sab_21";
	public static final String Sab_22 = "Sab_22";
	
	
	
	
	public DiscenteTeste3(int caso,int pc,int pt,int px,int estag,int tra,int estud,int pales,int vol,int out) {
		
		
		int pc1=0;
		int pt1=0;
		int px1=0;
		int estag1=0;
		int tra1=0;
		int estud1=0;
		int pales1=0;
		int vol1=0;
		int out1=0;
		
		if (pc == 1){
		pc1=20;
		pt1=0;
		}
		
		if (pt == 1){
			pt1=20;
			pc1=0;
			}
		
		if (px == 1){
			px1=20;
			}
		
		if (estag > 0){
			tra1=0;
			estag1=estag;
		}
		
		if (tra > 0){
			tra1=tra;
			estag1=0;
		}
		
		if (estud > 0){
			estud1=estud;
		}
		
		if (pales > 0){
			pales1=pales;
		}
		
		if (vol > 0){
			vol1=vol;
		}
		
		if (out > 0){
			out1=out;
		}
		
		
		
		
		for (int i = 0; i < pc1; i++)
			addVariable(new Variable("PIBIC" + (i+1)));
		
		for (int j = 0; j < pt1; j++)
			addVariable(new Variable("PIBIT" + (j+1)));
		
		for (int k = 0; k < px1; k++)
			addVariable(new Variable("PIBIX" + (k+1)));
		
		for (int l = 0; l < estag1; l++)
			addVariable(new Variable("ESTAGIO" + (l+1)));
		
		for (int m = 0; m < tra1; m++)
			addVariable(new Variable("TRABALHO" + (m+1)));
		
		for (int n = 0; n < estud1; n++)
			addVariable(new Variable("ESTUDOS" + (n+1)));
		
		for (int o = 0; o < pales1; o++)
			addVariable(new Variable("PALESTRAS" + (o+1)));
		
		for (int p = 0; p < vol1; p++)
			addVariable(new Variable("VOLUNTARIO" + (p+1)));
		
		for (int q = 0; q < out1; q++)
			addVariable(new Variable("OUTROS" + (q+1)));
		
		
		
		
		
			
		
		
		if(caso == 1) {
			Domain<String> positions = new Domain<>(
					Seg_13,Seg_14,Seg_15,Seg_16,Seg_17,Seg_18,Seg_19,Seg_20,
					Ter_13,Ter_14,Ter_17,Ter_18,Ter_19,Ter_20,Ter_21,Ter_22,
					Qua_13,Qua_14,Qua_15,Qua_16,Qua_17,Qua_18,Qua_19,Qua_20,
					Qui_13,Qui_14,Qui_17,Qui_18,Qui_21,Qui_22,
					Sex_13,Sex_14,Sex_15,Sex_16,Sex_17,Sex_18,Sex_19,Sex_20,Sex_21,Sex_22,
					Sab_13,Sab_14,Sab_15,Sab_16,Sab_17,Sab_18,Sab_19,Sab_20,Sab_21,Sab_22
					);
			for (Variable var : getVariables())
				setDomain(var, positions);
			
		}if (caso == 2) {
			Domain<String> positions = new Domain<>(
					Seg_15,Seg_16,Seg_19,Seg_22,
					Ter_13,Ter_14,Ter_17,Ter_18,Ter_19,Ter_20,Ter_21,Ter_22,
					Qua_15,Qua_16,Qua_19,Qua_22,
					Qui_13,Qui_14,Qui_17,Qui_18,Qui_19,Qui_20,Qui_21,Qui_22,
					Sex_17,Sex_18,Sex_19,Sex_20,Sex_21,Sex_22,
					Sab_13,Sab_14,Sab_15,Sab_16,Sab_17,Sab_18,Sab_19,Sab_20,Sab_21,Sab_22
					);
			for (Variable var : getVariables())
				setDomain(var, positions);
		}if (caso == 3) {
			Domain<String> positions = new Domain<>(
					Seg_19,Seg_20,Seg_21,Seg_22,
					Ter_19,Ter_20,Ter_21,Ter_22,
					Qua_19,Qua_20,Qua_21,Qua_22,
					Qui_19,Qui_20,Qui_21,Qui_22,
					Sex_15,Sex_16,Sex_19,Sex_20,Sex_21,Sex_22,
					Sab_13,Sab_14,Sab_15,Sab_16,Sab_17,Sab_18,Sab_19,Sab_20,Sab_21,Sab_22
					);
			for (Variable var : getVariables())
				setDomain(var, positions);
		}
		
		
		
		
		
	
		
		
		int size=0;
		size =pc1+pt1+px1+estag1+tra1+estud1+pales1+vol1;

		
		for (int i = 0; i < size; i++) {
			Variable var1 = getVariables().get(i);
			for (int j = i+1; j < size; j++) {
				Variable var2 = getVariables().get(j);
				
				addConstraint(new NotEqualConstraint<>(var1, var2));
			}
		}
	}

}
