import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class GuideGen {
	
	public static void main(String args[]){
		
		try{
		Random generator = new Random();
		
		File Guide = new File("Guides.txt");
		FileWriter Guidewriter = new FileWriter(Guide, false);
		PrintWriter GuidePW = new PrintWriter(Guidewriter);
		String Auxiliary1 = "";
		String Auxiliary2 = "";
		String Auxiliary3 = "";
		String Auxiliary4 = "";
		String Auxiliary5 = "";
		String Auxiliary6 = "";
		String FreePeriod1 = "";
		String FreePeriod2 = "";
		
		for(int b = 0; b < 4; b++){
			
			double GuideNum = generator.nextDouble();
			GuideNum = 50;
			GuideNum = (int)GuideNum;
			if(b == 0){
				for(int c = 0; c < GuideNum; c++){
					
					GuidePW.print("Prep"+"_" + c + " ");
					
					// Free periods
					String day = "";
					for(int a = 0; a < 2; a++){
						double Health = generator.nextDouble();
						Health = Health*6;
						Health = (int)Health;
						if(Health == 0){
							if(a == 1 && day == "Mon"){
								a--;
							}
							else{
								GuidePW.print("Mon_");
								day = "Mon";
							}
						}
						if(Health == 1){
							if(a == 1 && day == "Tues"){
								a--;
							}
							else{
								GuidePW.print("Tue_");
								day = "Tues";
							}
						}
						if(Health == 2){
							if(a == 1 && day == "Wed"){
								a--;
							}
							else{
								GuidePW.print("Wed_");
								day = "Wed";
							}
						}
						if(Health == 3){
							if(a == 1 && day == "Thurs"){
								a--;
							}
							else{
								GuidePW.print("Thu_");
								day = "Thurs";
							}
						}
						if(Health == 4){
							if(a == 1 && day == "Fri"){
								a--;
							}
							else{
								GuidePW.print("Fri_");
								day = "Fri";
							}
						}
						if(Health == 5){
							if(a == 1 && day == "Sat"){
								a--;
							}
							else{
								GuidePW.print("Sat_");
								day = "Sat";
							}
						}
					}
					
					double Free = generator.nextDouble();
					Free = Free*8;
					Free = (int)Free;
					if(Free == 0){
						GuidePW.print("A_T_");
						Auxiliary1 = "T";
					}
					if(Free == 1){
						GuidePW.print("B_U_");
						Auxiliary1 = "U";
					}
					if(Free == 2){
						GuidePW.print("C_V_");
						Auxiliary1 = "V";
					}
					if(Free == 3){
						GuidePW.print("D_W_");
						Auxiliary1 = "W";
					}
					if(Free == 4){
						GuidePW.print("E_X_");
						Auxiliary1 = "X";
					}
					if(Free == 5){
						GuidePW.print("F_Y_");
						Auxiliary1 = "Y";
					}
					if(Free == 6){
						GuidePW.print("G_Z_");
						Auxiliary1 = "Z";
					}
					if(Free == 7){
						GuidePW.print("H_Q_");
						Auxiliary1 = "Q";
					}
					
					for(int e = 0; e < 3; e++){
						double Auxiliary = generator.nextDouble();
						Auxiliary = Auxiliary*8;
						Auxiliary = (int)Auxiliary;
						if(e == 0){
							if(Auxiliary == 0){
								if(Auxiliary1.equals("T")){
									e--;
								}
								else{
									GuidePW.print("T_");
									Auxiliary2 = "T_";
								}
							}
							if(Auxiliary == 1){
								if(Auxiliary1.equals("U")){
									e--;
								}
								else{
									GuidePW.print("U_");
									Auxiliary2 = "U_";
								}
							}
							if(Auxiliary == 2){
								if(Auxiliary1.equals("V")){
									e--;
								}
								else{
									GuidePW.print("V_");
									Auxiliary2 = "V_";
								}
							}
							if(Auxiliary == 3){
								if(Auxiliary1.equals("W")){
									e--;
								}
								else{
									GuidePW.print("W_");
									Auxiliary2 = "W_";
								}
							}
							if(Auxiliary == 4){
								if(Auxiliary1.equals("X")){
									e--;
								}
								else{
									GuidePW.print("X_");
									Auxiliary2 = "X_";
								}
							}
							if(Auxiliary == 5){
								if(Auxiliary1.equals("Y")){
									e--;
								}
								else{
									GuidePW.print("Y_");
									Auxiliary2 = "Y_";
								}
							}
							if(Auxiliary == 6){
								if(Auxiliary1.equals("Z")){
									e--;
								}
								else{
									GuidePW.print("Z_");
									Auxiliary2 = "Z_";
								}
							}
							if(Auxiliary == 7){
								if(Auxiliary1.equals("Q")){
									e--;
								}
								else{
									GuidePW.print("Q_");
									Auxiliary2 = "Q_";
								}
							}
						}
						else if(e == 1){
							if(Auxiliary == 0){
								if(Auxiliary1.equals("T") || Auxiliary2.equals("T_")){
									e--;
								}
								else{
									GuidePW.print("T_");
									Auxiliary3 = "T_";
								}
							}
							else if(Auxiliary == 1){
								if(Auxiliary1.equals("U") || Auxiliary2.equals("U_")){
									e--;
								}
								else{
									GuidePW.print("U_");
									Auxiliary3 = "U_";
								}
							}
							if(Auxiliary == 2){
								if(Auxiliary1.equals("V") || Auxiliary2.equals("V_")){
									e--;
								}
								else{
									GuidePW.print("V_");
									Auxiliary3 = "V_";
								}
							}
							if(Auxiliary == 3){
								if(Auxiliary1.equals("W") || Auxiliary2.equals("W_")){
									e--;
								}
								else{
									GuidePW.print("W_");
									Auxiliary3 = "W_";
								}
							}
							if(Auxiliary == 4){
								if(Auxiliary1.equals("X") || Auxiliary2.equals("X_")){
									e--;
								}
								else{
									GuidePW.print("X_");
									Auxiliary3 = "X_";
								}
							}
							if(Auxiliary == 5){
								if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y_")){
									e--;
								}
								else{
									GuidePW.print("Y_");
									Auxiliary3 = "Y_";
								}
							}
							if(Auxiliary == 6){
								if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z_")){
									e--;
								}
								else{
									GuidePW.print("Z_");
									Auxiliary3 = "Z_";
								}
							}
							if(Auxiliary == 7){
								if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q_")){
									e--;
								}
								else{
									GuidePW.print("Q_");
									Auxiliary3 = "Q_";
								}
							}
						}
						if(e == 2){	
							if(Auxiliary == 0){
								if(Auxiliary1.equals("T") || Auxiliary2.equals("T_") || Auxiliary3.equals("T_")){
									e--;
								}
								else{
									GuidePW.print("T_ ");
								}
							}
							else if(Auxiliary == 1){
								if(Auxiliary1.equals("U") || Auxiliary2.equals("U_") || Auxiliary3.equals("U_")){
									e--;
								}
								else{
									GuidePW.print("U_ ");
								}
							}
							if(Auxiliary == 2){
								if(Auxiliary1.equals("V") || Auxiliary2.equals("V_") || Auxiliary3.equals("V_")){
									e--;
								}
								else{
									GuidePW.print("V_ ");
								}
							}
							if(Auxiliary == 3){
								if(Auxiliary1.equals("W") || Auxiliary2.equals("W_") || Auxiliary3.equals("W_")){
									e--;
								}
								else{
									GuidePW.print("W_ ");
								}
							}
							if(Auxiliary == 4){
								if(Auxiliary1.equals("X") || Auxiliary2.equals("X_") || Auxiliary3.equals("X_")){
									e--;
								}
								else{
									GuidePW.print("X_ ");
								}
							}
							if(Auxiliary == 5){
								if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y_") || Auxiliary3.equals("Y_")){
									e--;
								}
								else{
									GuidePW.print("Y_ ");
								}
							}
							if(Auxiliary == 6){
								if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z_") || Auxiliary3.equals("Z_")){
									e--;
								}
								else{
									GuidePW.print("Z_ ");
								}
							}
							if(Auxiliary == 7){
								if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q_") || Auxiliary3.equals("Q_")){
									e--;
								}
								else{
									GuidePW.print("Q_ ");
								}
							}
						}
					}
					double Guidecountry = generator.nextDouble();
					Guidecountry = Guidecountry*1152;
					Guidecountry = (int)Guidecountry;
					if(Guidecountry < 900){
						GuidePW.print("0.0 ");
					}
					else if(Guidecountry >= 900 && Guidecountry < 907){
						GuidePW.print("1.0 ");
					}
					else if(Guidecountry >= 907 && Guidecountry < 914){
						GuidePW.print("2.0 ");
					}
					else if(Guidecountry >= 914 && Guidecountry < 921){
						GuidePW.print("3.0 ");
					}
					else if(Guidecountry >= 921 && Guidecountry < 928){
						GuidePW.print("4.0 ");
					}
					else if(Guidecountry >= 928 && Guidecountry < 935){
						GuidePW.print("5.0 ");
					}
					else if(Guidecountry >= 935 && Guidecountry < 942){
						GuidePW.print("6.0 ");
					}
					else if(Guidecountry >= 942 && Guidecountry < 949){
						GuidePW.print("7.0 ");
					}
					else if(Guidecountry >= 949 && Guidecountry < 956){
						GuidePW.print("8.0 ");
					}
					else if(Guidecountry >= 956 && Guidecountry < 963){
						GuidePW.print("9.0 ");
					}
					else if(Guidecountry >= 963 && Guidecountry < 970){
						GuidePW.print("10.0 ");
					}
					else if(Guidecountry >= 970 && Guidecountry < 977){
						GuidePW.print("11.0 ");
					}
					else if(Guidecountry >= 977 && Guidecountry < 984){
						GuidePW.print("12.0 ");
					}
					else if(Guidecountry >= 984 && Guidecountry < 991){
						GuidePW.print("13.0 ");
					}
					else if(Guidecountry >= 991 && Guidecountry < 998){
						GuidePW.print("14.0 ");
					}
					else if(Guidecountry >= 998 && Guidecountry < 1005){
						GuidePW.print("15.0 ");
					}
					else if(Guidecountry >= 1005 && Guidecountry < 1012){
						GuidePW.print("16.0 ");
					}
					else if(Guidecountry >= 1012 && Guidecountry < 1019){
						GuidePW.print("17.0 ");
					}
					else if(Guidecountry >= 1019 && Guidecountry < 1026){
						GuidePW.print("18.0 ");
					}
					else if(Guidecountry >= 1026 && Guidecountry < 1033){
						GuidePW.print("19.0 ");
					}
					else if(Guidecountry >= 1033 && Guidecountry < 1040){
						GuidePW.print("20.0 ");
					}
					else if(Guidecountry >= 1040 && Guidecountry < 1047){
						GuidePW.print("21.0 ");
					}
					else if(Guidecountry >= 1047 && Guidecountry < 1054){
						GuidePW.print("22.0 ");
					}
					else if(Guidecountry >= 1054 && Guidecountry < 1061){
						GuidePW.print("23.0 ");
					}
					else if(Guidecountry >= 1061 && Guidecountry < 1068){
						GuidePW.print("24.0 ");
					}
					else if(Guidecountry >= 1068 && Guidecountry < 1075){
						GuidePW.print("25.0 ");
					}
					else if(Guidecountry >= 1075 && Guidecountry < 1082){
						GuidePW.print("26.0 ");
					}
					else if(Guidecountry >= 1082 && Guidecountry < 1089){
						GuidePW.print("27.0 ");
					}
					else if(Guidecountry >= 1089 && Guidecountry < 1096){
						GuidePW.print("28.0 ");
					}
					else if(Guidecountry >= 1096 && Guidecountry < 1103){
						GuidePW.print("29.0 ");
					}
					else if(Guidecountry >= 1103 && Guidecountry < 1110){
						GuidePW.print("30.0 ");
					}
					else if(Guidecountry >= 1110 && Guidecountry < 1117){
						GuidePW.print("31.0 ");
					}
					else if(Guidecountry >= 1117 && Guidecountry < 1124){
						GuidePW.print("32.0 ");
					}
					else if(Guidecountry >= 1124 && Guidecountry < 1131){
						GuidePW.print("33.0 ");
					}
					else if(Guidecountry >= 1131 && Guidecountry < 1138){
						GuidePW.print("34.0 ");
					}
					else if(Guidecountry >= 1138 && Guidecountry < 1145){
						GuidePW.print("35.0 ");
					}
					else if(Guidecountry >= 1145){
						GuidePW.print("36.0 ");
					}
					
					double gender = generator.nextDouble();
					gender = gender*2;
					gender = (int)gender;
					GuidePW.print(gender + " ");
					GuidePW.print("9 ");
					// Academic Interests: Math/Science, Humanities, Languages, Arts, All
					double academic = generator.nextDouble();
					academic = academic*100;
					academic = (int)academic;
					if(academic < 30){
						GuidePW.print("0.0 ");
					}
					else if(academic >= 30 && academic < 60){
						GuidePW.print("1.0 ");
					}
					else if(academic >= 60 && academic < 90){
						GuidePW.print("2.0 ");
					}
					else if(academic >= 90 && academic < 95){
						GuidePW.print("3.0 ");
					}
					else if(academic >= 95){
						GuidePW.print("4.0 ");
					}
					double fallProb = generator.nextDouble();
					fallProb = fallProb*2;
					fallProb = (int)fallProb;
					if(fallProb == 0){
						GuidePW.print("0.0 ");
						double WinterProb = generator.nextDouble();
						WinterProb = WinterProb*2;
						WinterProb = (int)WinterProb;
						if(WinterProb == 0){
							GuidePW.print("0.0 ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*2;
							SpringProb = (int)SpringProb;
							if(SpringProb == 0){
								GuidePW.print("0.0 ");
							}
							if(SpringProb == 1){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
						}
						else if(WinterProb == 1){
							double wintersport = generator.nextDouble();
							wintersport = wintersport*6 + 1;
							wintersport = (int)wintersport;
							if(gender == 0.0){
								if(wintersport == 6.0){
									do{
										wintersport = generator.nextDouble();
										wintersport = wintersport*6 + 1;
										wintersport = (int)wintersport;
									} while(wintersport == 6.0);
								}
							}
							GuidePW.print(wintersport + " ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*4;
							SpringProb = (int)SpringProb;
							if(SpringProb < 3){
								GuidePW.print("0.0 ");
							}
							else if(SpringProb == 3){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
						}
						
					}
					else if(fallProb == 1){
						double fallsport = generator.nextDouble();
						fallsport = fallsport*6 + 1;
						fallsport = (int)fallsport;
						if(gender == 1.0){
							if(fallsport == 2.0 || fallsport == 5.0){
								do{
									fallsport = generator.nextDouble();
									fallsport = fallsport*6 + 1;
									fallsport = (int)fallsport;
								} while(fallsport == 2.0 || fallsport == 5.0);
							}
						}
						else if(gender == 0.0){
							if(fallsport == 3.0 || fallsport == 6.0){
								do{
									fallsport = generator.nextDouble();
									fallsport = fallsport*6 + 1;
									fallsport = (int)fallsport;
								} while(fallsport == 3.0 || fallsport == 6.0);
							}
						}
						GuidePW.print(fallsport + " ");
						double WinterProb = generator.nextDouble();
						WinterProb = WinterProb*4;
						WinterProb = (int)WinterProb;
						if(WinterProb < 3){
							GuidePW.print("0.0 ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*4;
							SpringProb = (int)SpringProb;
							if(SpringProb < 3){
								GuidePW.print("0.0 ");
							}
							if(SpringProb == 3){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
						}
						if(WinterProb == 3){
							double wintersport = generator.nextDouble();
							wintersport = wintersport*6 + 1;
							wintersport = (int)wintersport;
							if(gender == 0.0){
								if(wintersport == 6.0){
									do{
										wintersport = generator.nextDouble();
										wintersport = wintersport*6 + 1;
										wintersport = (int)wintersport;
									} while(wintersport == 6.0);
								}
							}
							GuidePW.print(wintersport + " ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*10;
							SpringProb = (int)SpringProb;
							if(SpringProb == 0){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
							else if(SpringProb > 0){
								GuidePW.print("0.0 ");
							}
						}
					}
					//Clubs: Dance, Music, Math/Science, Debate/Public Speaking, Language, Culture
					double club1Prob = generator.nextDouble();
					club1Prob = club1Prob*5;
					club1Prob = (int)club1Prob;
					if(club1Prob == 0){
						GuidePW.print("0.0 0.0 ");
					}
					else{
						double club1 = generator.nextDouble();
						club1 = club1*7+1;
						club1 = (int)club1;
						GuidePW.print(club1 + " ");
						double club2Prob = generator.nextDouble();
						club2Prob = club2Prob*5;
						club2Prob = (int)club2Prob;
						if(club2Prob < 2){
							GuidePW.print("0.0 ");
						}
						else if(club2Prob >= 2){
							double club2 = generator.nextDouble();
							club2 = club2*7+1;
							club2 = (int)club2;
							if(club1 == club2){
								do{
									club2 = generator.nextDouble();
									club2 = club2*7+1;
									club2 = (int)club2;
								} while(club1 == club2);
							}
							GuidePW.print(club2 + " ");
						}
					}
					double boardingProb = generator.nextDouble();
					boardingProb = boardingProb*5;
					boardingProb = (int)boardingProb;
					if(boardingProb == 0){
						GuidePW.print("no ");
					}
					else if(boardingProb > 0){
						GuidePW.print("yes ");
					}
					GuidePW.println();
				}
			}
			if(b == 1){
				for(int c = 0; c < GuideNum; c++){
					GuidePW.print("Lower"+"_" + c + " ");
					// Free periods
					double Free = generator.nextDouble();
					Free = Free*8;
					Free = (int)Free;
					if(Free == 0){
						GuidePW.print("A_T_");
						Auxiliary1 = "T";
					}
					if(Free == 1){
						GuidePW.print("B_U_");
						Auxiliary1 = "U";
					}
					if(Free == 2){
						GuidePW.print("C_V_");
						Auxiliary1 = "V";
					}
					if(Free == 3){
						GuidePW.print("D_W_");
						Auxiliary1 = "W";
					}
					if(Free == 4){
						GuidePW.print("E_X_");
						Auxiliary1 = "X";
					}
					if(Free == 5){
						GuidePW.print("F_Y_");
						Auxiliary1 = "Y";
					}
					if(Free == 6){
						GuidePW.print("G_Z_");
						Auxiliary1 = "Z";
					}
					if(Free == 7){
						GuidePW.print("H_Q_");
						Auxiliary1 = "Q";
					}
					double numAuxiliary = generator.nextDouble();
					numAuxiliary = numAuxiliary*2;
					numAuxiliary = (int)numAuxiliary;
					for(int e = 0; e < 3 + numAuxiliary; e++){
						double Auxiliary = generator.nextDouble();
						Auxiliary = Auxiliary*8;
						Auxiliary = (int)Auxiliary;
						if(e == 0){
							if(Auxiliary == 0){
								if(Auxiliary1.equals("T")){
									e--;
								}
								else{
									GuidePW.print("T_");
									Auxiliary2 = "T_";
								}
							}
							if(Auxiliary == 1){
								if(Auxiliary1.equals("U")){
									e--;
								}
								else{
									GuidePW.print("U_");
									Auxiliary2 = "U_";
								}
							}
							if(Auxiliary == 2){
								if(Auxiliary1.equals("V")){
									e--;
								}
								else{
									GuidePW.print("V_");
									Auxiliary2 = "V_";
								}
							}
							if(Auxiliary == 3){
								if(Auxiliary1.equals("W")){
									e--;
								}
								else{
									GuidePW.print("W_");
									Auxiliary2 = "W_";
								}
							}
							if(Auxiliary == 4){
								if(Auxiliary1.equals("X")){
									e--;
								}
								else{
									GuidePW.print("X_");
									Auxiliary2 = "X_";
								}
							}
							if(Auxiliary == 5){
								if(Auxiliary1.equals("Y")){
									e--;
								}
								else{
									GuidePW.print("Y_");
									Auxiliary2 = "Y_";
								}
							}
							if(Auxiliary == 6){
								if(Auxiliary1.equals("Z")){
									e--;
								}
								else{
									GuidePW.print("Z_");
									Auxiliary2 = "Z_";
								}
							}
							if(Auxiliary == 7){
								if(Auxiliary1.equals("Q")){
									e--;
								}
								else{
									GuidePW.print("Q_");
									Auxiliary2 = "Q_";
								}
							}
						}
						else if(e == 1){
							if(Auxiliary == 0){
								if(Auxiliary1.equals("T") || Auxiliary2.equals("T_")){
									e--;
								}
								else{
									GuidePW.print("T_");
									Auxiliary3 = "T_";
								}
							}
							else if(Auxiliary == 1){
								if(Auxiliary1.equals("U") || Auxiliary2.equals("U_")){
									e--;
								}
								else{
									GuidePW.print("U_");
									Auxiliary3 = "U_";
								}
							}
							if(Auxiliary == 2){
								if(Auxiliary1.equals("V") || Auxiliary2.equals("V_")){
									e--;
								}
								else{
									GuidePW.print("V_");
									Auxiliary3 = "V_";
								}
							}
							if(Auxiliary == 3){
								if(Auxiliary1.equals("W") || Auxiliary2.equals("W_")){
									e--;
								}
								else{
									GuidePW.print("W_");
									Auxiliary3 = "W_";
								}
							}
							if(Auxiliary == 4){
								if(Auxiliary1.equals("X") || Auxiliary2.equals("X_")){
									e--;
								}
								else{
									GuidePW.print("X_");
									Auxiliary3 = "X_";
								}
							}
							if(Auxiliary == 5){
								if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y_")){
									e--;
								}
								else{
									GuidePW.print("Y_");
									Auxiliary3 = "Y_";
								}
							}
							if(Auxiliary == 6){
								if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z_")){
									e--;
								}
								else{
									GuidePW.print("Z_");
									Auxiliary3 = "Z_";
								}
							}
							if(Auxiliary == 7){
								if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q_")){
									e--;
								}
								else{
									GuidePW.print("Q_");
									Auxiliary3 = "Q_";
								}
							}
						}
						if(e == 2){	
							if(Auxiliary == 0){
								if(Auxiliary1.equals("T") || Auxiliary2.equals("T_") || Auxiliary3.equals("T_")){
									e--;
								}
								else{
									GuidePW.print("T_");
									Auxiliary4 = "T_";
								}
							}
							else if(Auxiliary == 1){
								if(Auxiliary1.equals("U") || Auxiliary2.equals("U_") || Auxiliary3.equals("U_")){
									e--;
								}
								else{
									GuidePW.print("U_");
									Auxiliary4 = "U_";
								}
							}
							if(Auxiliary == 2){
								if(Auxiliary1.equals("V") || Auxiliary2.equals("V_") || Auxiliary3.equals("V_")){
									e--;
								}
								else{
									GuidePW.print("V_");
									Auxiliary4 = "V_";
								}
							}
							if(Auxiliary == 3){
								if(Auxiliary1.equals("W") || Auxiliary2.equals("W_") || Auxiliary3.equals("W_")){
									e--;
								}
								else{
									GuidePW.print("W_");
									Auxiliary4 = "W_";
								}
							}
							if(Auxiliary == 4){
								if(Auxiliary1.equals("X") || Auxiliary2.equals("X_") || Auxiliary3.equals("X_")){
									e--;
								}
								else{
									GuidePW.print("X_");
									Auxiliary4 = "X_";
								}
							}
							if(Auxiliary == 5){
								if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y_") || Auxiliary3.equals("Y_")){
									e--;
								}
								else{
									GuidePW.print("Y_");
									Auxiliary4 = "Y_";
								}
							}
							if(Auxiliary == 6){
								if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z_") || Auxiliary3.equals("Z_")){
									e--;
								}
								else{
									GuidePW.print("Z_");
									Auxiliary4 = "Z_";
								}
							}
							if(Auxiliary == 7){
								if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q_") || Auxiliary3.equals("Q_")){
									e--;
								}
								else{
									GuidePW.print("Q_");
									Auxiliary4 = "Q_";
								}
							}
						}
						if(numAuxiliary == 1){
							if(e == 3){
								if(Auxiliary == 0){
									if(Auxiliary1.equals("T") || Auxiliary2.equals("T_") || Auxiliary3.equals("T_") || Auxiliary4.equals("T_")){
										e--;
									}
									else{
										GuidePW.print("T_ ");
									}
								}
								else if(Auxiliary == 1){
									if(Auxiliary1.equals("U") || Auxiliary2.equals("U_") || Auxiliary3.equals("U_") || Auxiliary4.equals("U_")){
										e--;
									}
									else{
										GuidePW.print("U_ ");
									}
								}
								if(Auxiliary == 2){
									if(Auxiliary1.equals("V") || Auxiliary2.equals("V_") || Auxiliary3.equals("V_") || Auxiliary4.equals("V_")){
										e--;
									}
									else{
										GuidePW.print("V_ ");
									}
								}
								if(Auxiliary == 3){
									if(Auxiliary1.equals("W") || Auxiliary2.equals("W_") || Auxiliary3.equals("W_") || Auxiliary3.equals("W_")){
										e--;
									}
									else{
										GuidePW.print("W_ ");
									}
								}
								if(Auxiliary == 4){
									if(Auxiliary1.equals("X") || Auxiliary2.equals("X_") || Auxiliary3.equals("X_") || Auxiliary3.equals("X_")){
										e--;
									}
									else{
										GuidePW.print("X_ ");
									}
								}
								if(Auxiliary == 5){
									if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y_") || Auxiliary3.equals("Y_") || Auxiliary3.equals("Y_")){
										e--;
									}
									else{
										GuidePW.print("Y_ ");
									}
								}
								if(Auxiliary == 6){
									if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z_") || Auxiliary3.equals("Z_") || Auxiliary3.equals("Z_")){
										e--;
									}
									else{
										GuidePW.print("Z_ ");
									}
								}
								if(Auxiliary == 7){
									if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q_") || Auxiliary3.equals("Q_") || Auxiliary3.equals("Q_")){
										e--;
									}
									else{
										GuidePW.print("Q_ ");
									}
								}
							}
						}
						if(numAuxiliary == 0){
							if(e == 2){
								GuidePW.print(" ");
							}
						}
					}
					double Guidecountry = generator.nextDouble();
					Guidecountry = Guidecountry*1152;
					Guidecountry = (int)Guidecountry;
					if(Guidecountry < 900){
						GuidePW.print("0.0 ");
					}
					else if(Guidecountry >= 900 && Guidecountry < 907){
						GuidePW.print("1.0 ");
					}
					else if(Guidecountry >= 907 && Guidecountry < 914){
						GuidePW.print("2.0 ");
					}
					else if(Guidecountry >= 914 && Guidecountry < 921){
						GuidePW.print("3.0 ");
					}
					else if(Guidecountry >= 921 && Guidecountry < 928){
						GuidePW.print("4.0 ");
					}
					else if(Guidecountry >= 928 && Guidecountry < 935){
						GuidePW.print("5.0 ");
					}
					else if(Guidecountry >= 935 && Guidecountry < 942){
						GuidePW.print("6.0 ");
					}
					else if(Guidecountry >= 942 && Guidecountry < 949){
						GuidePW.print("7.0 ");
					}
					else if(Guidecountry >= 949 && Guidecountry < 956){
						GuidePW.print("8.0 ");
					}
					else if(Guidecountry >= 956 && Guidecountry < 963){
						GuidePW.print("9.0 ");
					}
					else if(Guidecountry >= 963 && Guidecountry < 970){
						GuidePW.print("10.0 ");
					}
					else if(Guidecountry >= 970 && Guidecountry < 977){
						GuidePW.print("11.0 ");
					}
					else if(Guidecountry >= 977 && Guidecountry < 984){
						GuidePW.print("12.0 ");
					}
					else if(Guidecountry >= 984 && Guidecountry < 991){
						GuidePW.print("13.0 ");
					}
					else if(Guidecountry >= 991 && Guidecountry < 998){
						GuidePW.print("14.0 ");
					}
					else if(Guidecountry >= 998 && Guidecountry < 1005){
						GuidePW.print("15.0 ");
					}
					else if(Guidecountry >= 1005 && Guidecountry < 1012){
						GuidePW.print("16.0 ");
					}
					else if(Guidecountry >= 1012 && Guidecountry < 1019){
						GuidePW.print("17.0 ");
					}
					else if(Guidecountry >= 1019 && Guidecountry < 1026){
						GuidePW.print("18.0 ");
					}
					else if(Guidecountry >= 1026 && Guidecountry < 1033){
						GuidePW.print("19.0 ");
					}
					else if(Guidecountry >= 1033 && Guidecountry < 1040){
						GuidePW.print("20.0 ");
					}
					else if(Guidecountry >= 1040 && Guidecountry < 1047){
						GuidePW.print("21.0 ");
					}
					else if(Guidecountry >= 1047 && Guidecountry < 1054){
						GuidePW.print("22.0 ");
					}
					else if(Guidecountry >= 1054 && Guidecountry < 1061){
						GuidePW.print("23.0 ");
					}
					else if(Guidecountry >= 1061 && Guidecountry < 1068){
						GuidePW.print("24.0 ");
					}
					else if(Guidecountry >= 1068 && Guidecountry < 1075){
						GuidePW.print("25.0 ");
					}
					else if(Guidecountry >= 1075 && Guidecountry < 1082){
						GuidePW.print("26.0 ");
					}
					else if(Guidecountry >= 1082 && Guidecountry < 1089){
						GuidePW.print("27.0 ");
					}
					else if(Guidecountry >= 1089 && Guidecountry < 1096){
						GuidePW.print("28.0 ");
					}
					else if(Guidecountry >= 1096 && Guidecountry < 1103){
						GuidePW.print("29.0 ");
					}
					else if(Guidecountry >= 1103 && Guidecountry < 1110){
						GuidePW.print("30.0 ");
					}
					else if(Guidecountry >= 1110 && Guidecountry < 1117){
						GuidePW.print("31.0 ");
					}
					else if(Guidecountry >= 1117 && Guidecountry < 1124){
						GuidePW.print("32.0 ");
					}
					else if(Guidecountry >= 1124 && Guidecountry < 1131){
						GuidePW.print("33.0 ");
					}
					else if(Guidecountry >= 1131 && Guidecountry < 1138){
						GuidePW.print("34.0 ");
					}
					else if(Guidecountry >= 1138 && Guidecountry < 1145){
						GuidePW.print("35.0 ");
					}
					else if(Guidecountry >= 1145){
						GuidePW.print("36.0 ");
					}
					
					double gender = generator.nextDouble();
					gender = gender*2;
					gender = (int)gender;
					GuidePW.print(gender + " ");
					GuidePW.print("10 ");
					// Academic Interests: Math/Science, Humanities, Languages, Arts, All
					double academic = generator.nextDouble();
					academic = academic*100;
					academic = (int)academic;
					if(academic < 30){
						GuidePW.print("0.0 ");
					}
					else if(academic >= 30 && academic < 60){
						GuidePW.print("1.0 ");
					}
					else if(academic >= 60 && academic < 90){
						GuidePW.print("2.0 ");
					}
					else if(academic >= 90 && academic < 95){
						GuidePW.print("3.0 ");
					}
					else if(academic >= 95){
						GuidePW.print("4.0 ");
					}
					double fallProb = generator.nextDouble();
					fallProb = fallProb*2;
					fallProb = (int)fallProb;
					if(fallProb == 0){
						GuidePW.print("0.0 ");
						double WinterProb = generator.nextDouble();
						WinterProb = WinterProb*2;
						WinterProb = (int)WinterProb;
						if(WinterProb == 0){
							GuidePW.print("0.0 ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*2;
							SpringProb = (int)SpringProb;
							if(SpringProb == 0){
								GuidePW.print("0.0 ");
							}
							if(SpringProb == 1){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
						}
						else if(WinterProb == 1){
							double wintersport = generator.nextDouble();
							wintersport = wintersport*6 + 1;
							wintersport = (int)wintersport;
							if(gender == 0.0){
								if(wintersport == 6.0){
									do{
										wintersport = generator.nextDouble();
										wintersport = wintersport*6 + 1;
										wintersport = (int)wintersport;
									} while(wintersport == 6.0);
								}
							}
							GuidePW.print(wintersport + " ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*4;
							SpringProb = (int)SpringProb;
							if(SpringProb < 3){
								GuidePW.print("0.0 ");
							}
							else if(SpringProb == 3){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
						}
						
					}
					else if(fallProb == 1){
						double fallsport = generator.nextDouble();
						fallsport = fallsport*6 + 1;
						fallsport = (int)fallsport;
						if(gender == 1.0){
							if(fallsport == 2.0 || fallsport == 5.0){
								do{
									fallsport = generator.nextDouble();
									fallsport = fallsport*6 + 1;
									fallsport = (int)fallsport;
								} while(fallsport == 2.0 || fallsport == 5.0);
							}
						}
						else if(gender == 0.0){
							if(fallsport == 3.0 || fallsport == 6.0){
								do{
									fallsport = generator.nextDouble();
									fallsport = fallsport*6 + 1;
									fallsport = (int)fallsport;
								} while(fallsport == 3.0 || fallsport == 6.0);
							}
						}
						GuidePW.print(fallsport + " ");
						double WinterProb = generator.nextDouble();
						WinterProb = WinterProb*4;
						WinterProb = (int)WinterProb;
						if(WinterProb < 3){
							GuidePW.print("0.0 ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*4;
							SpringProb = (int)SpringProb;
							if(SpringProb < 3){
								GuidePW.print("0.0 ");
							}
							if(SpringProb == 3){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
						}
						if(WinterProb == 3){
							double wintersport = generator.nextDouble();
							wintersport = wintersport*6 + 1;
							wintersport = (int)wintersport;
							if(gender == 0.0){
								if(wintersport == 6.0){
									do{
										wintersport = generator.nextDouble();
										wintersport = wintersport*6 + 1;
										wintersport = (int)wintersport;
									} while(wintersport == 6.0);
								}
							}
							GuidePW.print(wintersport + " ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*10;
							SpringProb = (int)SpringProb;
							if(SpringProb == 0){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
							else if(SpringProb > 0){
								GuidePW.print("0.0 ");
							}
						}
					}
					//Clubs: Dance, Music, Math/Science, Debate/Public Speaking, Language, Culture
					double club1Prob = generator.nextDouble();
					club1Prob = club1Prob*5;
					club1Prob = (int)club1Prob;
					if(club1Prob == 0){
						GuidePW.print("0.0 0.0 ");
					}
					else if(club1Prob > 0){
						double club1 = generator.nextDouble();
						club1 = club1*7+1;
						club1 = (int)club1;
						GuidePW.print(club1 + " ");
						double club2Prob = generator.nextDouble();
						club2Prob = club2Prob*5;
						club2Prob = (int)club2Prob;
						if(club2Prob < 2){
							GuidePW.print("0.0 ");
						}
						else if(club2Prob >= 2){
							double club2 = generator.nextDouble();
							club2 = club2*7+1;
							club2 = (int)club2;
							if(club1 == club2){
								do{
									club2 = generator.nextDouble();
									club2 = club2*7+1;
									club2 = (int)club2;
								} while(club1 == club2);
							}
							GuidePW.print(club2 + " ");
						}
					}
					double boardingProb = generator.nextDouble();
					boardingProb = boardingProb*5;
					boardingProb = (int)boardingProb;
					if(boardingProb == 0){
						GuidePW.print("no ");
					}
					else if(boardingProb > 0){
						GuidePW.print("yes ");
					}
					GuidePW.println();
				}
			}
			if(b == 2){
				for(int c = 0; c < GuideNum; c++){
					GuidePW.print("Upper"+"_" + c + " ");
					// Free periods
					double Free = generator.nextDouble();
					Free = Free*8;
					Free = (int)Free;
					if(Free == 0){
						GuidePW.print("A_T_");
						Auxiliary1 = "T";
						FreePeriod1 = "A_T_";
					}
					if(Free == 1){
						GuidePW.print("B_U_");
						Auxiliary1 = "U";
						FreePeriod1 = "B_U_";
					}
					if(Free == 2){
						GuidePW.print("C_V_");
						Auxiliary1 = "V";
						FreePeriod1 = "C_V_";
					}
					if(Free == 3){
						GuidePW.print("D_W_");
						Auxiliary1 = "W";
						FreePeriod1 = "D_W_";
					}
					if(Free == 4){
						GuidePW.print("E_X_");
						Auxiliary1 = "X";
						FreePeriod1 = "E_X_";
					}
					if(Free == 5){
						GuidePW.print("F_Y_");
						Auxiliary1 = "Y";
						FreePeriod1 = "F_Y_";
					}
					if(Free == 6){
						GuidePW.print("G_Z_");
						Auxiliary1 = "Z";
						FreePeriod1 = "G_Z_";
					}
					if(Free == 7){
						GuidePW.print("H_Q_");
						Auxiliary1 = "Q";
						FreePeriod1 = "H_Q_";
					}
					double Probopt = generator.nextDouble();
					Probopt = Probopt*4;
					Probopt = (int)Probopt;
					if(Probopt == 0){
						for(int x = 0; x < 2; x++){
							double opt = generator.nextDouble();
							opt = opt*8;
							opt = (int)opt;
							if(opt == 0){
								if(x == 0){
									if(FreePeriod1.equals("A_T_")){
										x--;
									}
									else{
										GuidePW.print("A_T_");
										Auxiliary2 = "T";
										FreePeriod2 = "A_T_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("A_T_") || FreePeriod2.equals("A_T_")){
										x--;
									}
									else{
										GuidePW.print("A_T_");
										Auxiliary3 = "T";
									}
								}
							}
							if(opt == 1){
								if(x == 0){
									if(FreePeriod1.equals("B_U_")){
										x--;
									}
									else{
										GuidePW.print("B_U_");
										Auxiliary2 = "U";
										FreePeriod2 = "B_U_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("B_U_") || FreePeriod2.equals("B_U_")){
										x--;
									}
									else{
										GuidePW.print("B_U_");
										Auxiliary3 = "U";
									}
								}
							}
							if(opt == 2){
								if(x == 0){
									if(FreePeriod1.equals("C_V_")){
										x--;
									}
									else{
										GuidePW.print("C_V_");
										Auxiliary2 = "V";
										FreePeriod2 = "C_V_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("C_V_") || FreePeriod2.equals("C_V_")){
										x--;
									}
									else{
										GuidePW.print("C_V_");
										Auxiliary3 = "V";
									}
								}
							}
							if(opt == 3){
								if(x == 0){
									if(FreePeriod1.equals("D_W_")){
										x--;
									}
									else{
										GuidePW.print("D_W_");
										Auxiliary2 = "W";
										FreePeriod2 = "D_W_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("D_W_") || FreePeriod2.equals("D_W_")){
										x--;
									}
									else{
										GuidePW.print("D_W_");
										Auxiliary3 = "W";
									}
								}
							}
							if(opt == 4){
								if(x == 0){
									if(FreePeriod1.equals("E_X_")){
										x--;
									}
									else{
										GuidePW.print("E_X_");
										Auxiliary2 = "X";
										FreePeriod2 = "E_X_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("E_X_") || FreePeriod2.equals("E_X_")){
										x--;
									}
									else{
										GuidePW.print("E_X_");
										Auxiliary3 = "X";
									}
								}
							}
							if(opt == 5){
								if(x == 0){
									if(FreePeriod1.equals("F_Y_")){
										x--;
									}
									else{
										GuidePW.print("F_Y_");
										Auxiliary2 = "Y";
										FreePeriod2 = "F_Y_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("F_Y_") || FreePeriod2.equals("F_Y_")){
										x--;
									}
									else{
										GuidePW.print("F_Y_");
										Auxiliary3 = "Y";
									}
								}
							}
							if(opt == 6){
								if(x == 0){
									if(FreePeriod1.equals("G_Z_")){
										x--;
									}
									else{
										GuidePW.print("G_Z_");
										Auxiliary2 = "Z";
										FreePeriod2 = "G_Z_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("G_Z_") || FreePeriod2.equals("G_Z_")){
										x--;
									}
									else{
										GuidePW.print("G_Z_");
										Auxiliary3 = "Z";
									}
								}
							}
							if(opt == 7){
								if(x == 0){
									if(FreePeriod1.equals("H_Q_")){
										x--;
									}
									else{
										GuidePW.print("H_Q_");
										Auxiliary2 = "Q";
										FreePeriod2 = "H_Q_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("H_Q_") || FreePeriod2.equals("H_Q_")){
										x--;
									}
									else{
										GuidePW.print("H_Q_");
										Auxiliary3 = "Q";
									}
								}
							}
						}
					}
					double numAuxiliary = generator.nextDouble();
					numAuxiliary = numAuxiliary*2;
					numAuxiliary = (int)numAuxiliary;
					for(int e = 0; e < 3 + numAuxiliary; e++){
						double Auxiliary = generator.nextDouble();
						Auxiliary = Auxiliary*8;
						Auxiliary = (int)Auxiliary;
						if(e == 0){
							if(Auxiliary == 0){
								if(Auxiliary1.equals("T") || Auxiliary2.equals("T") || Auxiliary3.equals("T")){
									e--;
								}
								else{
									GuidePW.print("T_");
									Auxiliary4 = "T";
								}
							}
							if(Auxiliary == 1){
								if(Auxiliary1.equals("U") || Auxiliary2.equals("U") || Auxiliary3.equals("U")){
									e--;
								}
								else{
									GuidePW.print("U_");
									Auxiliary4 = "U";
								}
							}
							if(Auxiliary == 2){
								if(Auxiliary1.equals("V") || Auxiliary2.equals("V") || Auxiliary3.equals("V")){
									e--;
								}
								else{
									GuidePW.print("V_");
									Auxiliary4 = "V";
								}
							}
							if(Auxiliary == 3){
								if(Auxiliary1.equals("W") || Auxiliary2.equals("W") || Auxiliary3.equals("W")){
									e--;
								}
								else{
									GuidePW.print("W_");
									Auxiliary4 = "W";
								}
							}
							if(Auxiliary == 4){
								if(Auxiliary1.equals("X") || Auxiliary2.equals("X") || Auxiliary3.equals("X")){
									e--;
								}
								else{
									GuidePW.print("X_");
									Auxiliary4 = "X";
								}
							}
							if(Auxiliary == 5){
								if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y") || Auxiliary3.equals("Y")){
									e--;
								}
								else{
									GuidePW.print("Y_");
									Auxiliary4 = "Y";
								}
							}
							if(Auxiliary == 6){
								if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z") || Auxiliary3.equals("Z")){
									e--;
								}
								else{
									GuidePW.print("Z_");
									Auxiliary4 = "Z";
								}
							}
							if(Auxiliary == 7){
								if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q") || Auxiliary3.equals("Q")){
									e--;
								}
								else{
									GuidePW.print("Q_");
									Auxiliary4 = "Q";
								}
							}
						}
						else if(e == 1){
							if(Auxiliary == 0){
								if(Auxiliary1.equals("T") || Auxiliary2.equals("T") || Auxiliary3.equals("T") || Auxiliary4.equals("T")){
									e--;
								}
								else{
									GuidePW.print("T_");
									Auxiliary5 = "T";
								}
							}
							else if(Auxiliary == 1){
								if(Auxiliary1.equals("U") || Auxiliary2.equals("U") || Auxiliary3.equals("U") || Auxiliary4.equals("U")){
									e--;
								}
								else{
									GuidePW.print("U_");
									Auxiliary5 = "U";
								}
							}
							if(Auxiliary == 2){
								if(Auxiliary1.equals("V") || Auxiliary2.equals("V") || Auxiliary3.equals("V") || Auxiliary4.equals("V")){
									e--;
								}
								else{
									GuidePW.print("V_");
									Auxiliary5 = "V";
								}
							}
							if(Auxiliary == 3){
								if(Auxiliary1.equals("W") || Auxiliary2.equals("W") || Auxiliary3.equals("W") || Auxiliary4.equals("W")){
									e--;
								}
								else{
									GuidePW.print("W_");
									Auxiliary5 = "W";
								}
							}
							if(Auxiliary == 4){
								if(Auxiliary1.equals("X") || Auxiliary2.equals("X") || Auxiliary3.equals("X") || Auxiliary4.equals("X")){
									e--;
								}
								else{
									GuidePW.print("X_");
									Auxiliary5 = "X";
								}
							}
							if(Auxiliary == 5){
								if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y") || Auxiliary3.equals("Y") || Auxiliary4.equals("Y")){
									e--;
								}
								else{
									GuidePW.print("Y_");
									Auxiliary5 = "Y";
								}
							}
							if(Auxiliary == 6){
								if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z") || Auxiliary3.equals("Z") || Auxiliary4.equals("Z")){
									e--;
								}
								else{
									GuidePW.print("Z_");
									Auxiliary5 = "Z";
								}
							}
							if(Auxiliary == 7){
								if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q") || Auxiliary3.equals("Q") || Auxiliary4.equals("Q")){
									e--;
								}
								else{
									GuidePW.print("Q_");
									Auxiliary5 = "Q";
								}
							}
						}
						if(e == 2){	
							if(Auxiliary == 0){
								if(Auxiliary1.equals("T") || Auxiliary2.equals("T") || Auxiliary3.equals("T") || Auxiliary4.equals("T") || Auxiliary5.equals("T")){
									e--;
								}
								else{
									GuidePW.print("T_");
									Auxiliary6 = "T";
								}
							}
							else if(Auxiliary == 1){
								if(Auxiliary1.equals("U") || Auxiliary2.equals("U") || Auxiliary3.equals("U") || Auxiliary4.equals("U") || Auxiliary5.equals("U")){
									e--;
								}
								else{
									GuidePW.print("U_");
									Auxiliary6 = "U";
								}
							}
							if(Auxiliary == 2){
								if(Auxiliary1.equals("V") || Auxiliary2.equals("V") || Auxiliary3.equals("V") || Auxiliary4.equals("V") || Auxiliary5.equals("V")){
									e--;
								}
								else{
									GuidePW.print("V_");
									Auxiliary6 = "V";
								}
							}
							if(Auxiliary == 3){
								if(Auxiliary1.equals("W") || Auxiliary2.equals("W") || Auxiliary3.equals("W") || Auxiliary4.equals("W") || Auxiliary5.equals("W")){
									e--;
								}
								else{
									GuidePW.print("W_");
									Auxiliary6 = "W";
								}
							}
							if(Auxiliary == 4){
								if(Auxiliary1.equals("X") || Auxiliary2.equals("X") || Auxiliary3.equals("X") || Auxiliary4.equals("X") || Auxiliary5.equals("X")){
									e--;
								}
								else{
									GuidePW.print("X_");
									Auxiliary6 = "X";
								}
							}
							if(Auxiliary == 5){
								if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y") || Auxiliary3.equals("Y") || Auxiliary4.equals("Y") || Auxiliary5.equals("Y")){
									e--;
								}
								else{
									GuidePW.print("Y_");
									Auxiliary6 = "Y";
								}
							}
							if(Auxiliary == 6){
								if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z") || Auxiliary3.equals("Z") || Auxiliary4.equals("Z") || Auxiliary5.equals("Z")){
									e--;
								}
								else{
									GuidePW.print("Z_");
									Auxiliary6 = "Z";
								}
							}
							if(Auxiliary == 7){
								if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q") || Auxiliary3.equals("Q") || Auxiliary4.equals("Q") || Auxiliary5.equals("Q")){
									e--;
								}
								else{
									GuidePW.print("Q_");
									Auxiliary6 = "Q";
								}
							}
						}
						if(numAuxiliary == 1){
							if(e == 3){
								if(Auxiliary == 0){
									if(Auxiliary1.equals("T") || Auxiliary2.equals("T") || Auxiliary3.equals("T") || Auxiliary4.equals("T") || Auxiliary5.equals("T") || Auxiliary6.equals("T")){
										e--;
									}
									else{
										GuidePW.print("T_ ");
									}
								}
								else if(Auxiliary == 1){
									if(Auxiliary1.equals("U") || Auxiliary2.equals("U") || Auxiliary3.equals("U") || Auxiliary4.equals("U") || Auxiliary5.equals("U") || Auxiliary6.equals("U")){
										e--;
									}
									else{
										GuidePW.print("U_ ");
									}
								}
								if(Auxiliary == 2){
									if(Auxiliary1.equals("V") || Auxiliary2.equals("V") || Auxiliary3.equals("V") || Auxiliary4.equals("V") || Auxiliary5.equals("V") || Auxiliary6.equals("V")){
										e--;
									}
									else{
										GuidePW.print("V_ ");
									}
								}
								if(Auxiliary == 3){
									if(Auxiliary1.equals("W") || Auxiliary2.equals("W") || Auxiliary3.equals("W") || Auxiliary4.equals("W") || Auxiliary5.equals("W") || Auxiliary6.equals("W")){
										e--;
									}
									else{
										GuidePW.print("W_ ");
									}
								}
								if(Auxiliary == 4){
									if(Auxiliary1.equals("X") || Auxiliary2.equals("X") || Auxiliary3.equals("X") || Auxiliary4.equals("X") || Auxiliary5.equals("X") || Auxiliary6.equals("X")){
										e--;
									}
									else{
										GuidePW.print("X_ ");
									}
								}
								if(Auxiliary == 5){
									if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y") || Auxiliary3.equals("Y") || Auxiliary4.equals("Y") || Auxiliary5.equals("Y") || Auxiliary6.equals("Y")){
										e--;
									}
									else{
										GuidePW.print("Y_ ");
									}
								}
								if(Auxiliary == 6){
									if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z") || Auxiliary3.equals("Z") || Auxiliary4.equals("Z") || Auxiliary5.equals("Z") || Auxiliary6.equals("Z")){
										e--;
									}
									else{
										GuidePW.print("Z_ ");
									}
								}
								if(Auxiliary == 7){
									if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q") || Auxiliary3.equals("Q") || Auxiliary4.equals("Q") || Auxiliary5.equals("Q") || Auxiliary6.equals("Q")){
										e--;
									}
									else{
										GuidePW.print("Q_ ");
									}
								}
							}
						}
						if(numAuxiliary == 0){
							if(e == 2){
								GuidePW.print(" ");
							}
						}
					}
					double Guidecountry = generator.nextDouble();
					Guidecountry = Guidecountry*1152;
					Guidecountry = (int)Guidecountry;
					if(Guidecountry < 900){
						GuidePW.print("0.0 ");
					}
					else if(Guidecountry >= 900 && Guidecountry < 907){
						GuidePW.print("1.0 ");
					}
					else if(Guidecountry >= 907 && Guidecountry < 914){
						GuidePW.print("2.0 ");
					}
					else if(Guidecountry >= 914 && Guidecountry < 921){
						GuidePW.print("3.0 ");
					}
					else if(Guidecountry >= 921 && Guidecountry < 928){
						GuidePW.print("4.0 ");
					}
					else if(Guidecountry >= 928 && Guidecountry < 935){
						GuidePW.print("5.0 ");
					}
					else if(Guidecountry >= 935 && Guidecountry < 942){
						GuidePW.print("6.0 ");
					}
					else if(Guidecountry >= 942 && Guidecountry < 949){
						GuidePW.print("7.0 ");
					}
					else if(Guidecountry >= 949 && Guidecountry < 956){
						GuidePW.print("8.0 ");
					}
					else if(Guidecountry >= 956 && Guidecountry < 963){
						GuidePW.print("9.0 ");
					}
					else if(Guidecountry >= 963 && Guidecountry < 970){
						GuidePW.print("10.0 ");
					}
					else if(Guidecountry >= 970 && Guidecountry < 977){
						GuidePW.print("11.0 ");
					}
					else if(Guidecountry >= 977 && Guidecountry < 984){
						GuidePW.print("12.0 ");
					}
					else if(Guidecountry >= 984 && Guidecountry < 991){
						GuidePW.print("13.0 ");
					}
					else if(Guidecountry >= 991 && Guidecountry < 998){
						GuidePW.print("14.0 ");
					}
					else if(Guidecountry >= 998 && Guidecountry < 1005){
						GuidePW.print("15.0 ");
					}
					else if(Guidecountry >= 1005 && Guidecountry < 1012){
						GuidePW.print("16.0 ");
					}
					else if(Guidecountry >= 1012 && Guidecountry < 1019){
						GuidePW.print("17.0 ");
					}
					else if(Guidecountry >= 1019 && Guidecountry < 1026){
						GuidePW.print("18.0 ");
					}
					else if(Guidecountry >= 1026 && Guidecountry < 1033){
						GuidePW.print("19.0 ");
					}
					else if(Guidecountry >= 1033 && Guidecountry < 1040){
						GuidePW.print("20.0 ");
					}
					else if(Guidecountry >= 1040 && Guidecountry < 1047){
						GuidePW.print("21.0 ");
					}
					else if(Guidecountry >= 1047 && Guidecountry < 1054){
						GuidePW.print("22.0 ");
					}
					else if(Guidecountry >= 1054 && Guidecountry < 1061){
						GuidePW.print("23.0 ");
					}
					else if(Guidecountry >= 1061 && Guidecountry < 1068){
						GuidePW.print("24.0 ");
					}
					else if(Guidecountry >= 1068 && Guidecountry < 1075){
						GuidePW.print("25.0 ");
					}
					else if(Guidecountry >= 1075 && Guidecountry < 1082){
						GuidePW.print("26.0 ");
					}
					else if(Guidecountry >= 1082 && Guidecountry < 1089){
						GuidePW.print("27.0 ");
					}
					else if(Guidecountry >= 1089 && Guidecountry < 1096){
						GuidePW.print("28.0 ");
					}
					else if(Guidecountry >= 1096 && Guidecountry < 1103){
						GuidePW.print("29.0 ");
					}
					else if(Guidecountry >= 1103 && Guidecountry < 1110){
						GuidePW.print("30.0 ");
					}
					else if(Guidecountry >= 1110 && Guidecountry < 1117){
						GuidePW.print("31.0 ");
					}
					else if(Guidecountry >= 1117 && Guidecountry < 1124){
						GuidePW.print("32.0 ");
					}
					else if(Guidecountry >= 1124 && Guidecountry < 1131){
						GuidePW.print("33.0 ");
					}
					else if(Guidecountry >= 1131 && Guidecountry < 1138){
						GuidePW.print("34.0 ");
					}
					else if(Guidecountry >= 1138 && Guidecountry < 1145){
						GuidePW.print("35.0 ");
					}
					else if(Guidecountry >= 1145){
						GuidePW.print("36.0 ");
					}
					
					double gender = generator.nextDouble();
					gender = gender*2;
					gender = (int)gender;
					GuidePW.print(gender + " ");
					GuidePW.print("11 ");
					// Academic Interests: Math/Science, Humanities, Languages, Arts, All
					double academic = generator.nextDouble();
					academic = academic*100;
					academic = (int)academic;
					if(academic < 30){
						GuidePW.print("0.0 ");
					}
					else if(academic >= 30 && academic < 60){
						GuidePW.print("1.0 ");
					}
					else if(academic >= 60 && academic < 90){
						GuidePW.print("2.0 ");
					}
					else if(academic >= 90 && academic < 95){
						GuidePW.print("3.0 ");
					}
					else if(academic >= 95){
						GuidePW.print("4.0 ");
					}
					double fallProb = generator.nextDouble();
					fallProb = fallProb*2;
					fallProb = (int)fallProb;
					if(fallProb == 0){
						GuidePW.print("0.0 ");
						double WinterProb = generator.nextDouble();
						WinterProb = WinterProb*2;
						WinterProb = (int)WinterProb;
						if(WinterProb == 0){
							GuidePW.print("0.0 ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*2;
							SpringProb = (int)SpringProb;
							if(SpringProb == 0){
								GuidePW.print("0.0 ");
							}
							if(SpringProb == 1){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
						}
						else if(WinterProb == 1){
							double wintersport = generator.nextDouble();
							wintersport = wintersport*6 + 1;
							wintersport = (int)wintersport;
							if(gender == 0.0){
								if(wintersport == 6.0){
									do{
										wintersport = generator.nextDouble();
										wintersport = wintersport*6 + 1;
										wintersport = (int)wintersport;
									} while(wintersport == 6.0);
								}
							}
							GuidePW.print(wintersport + " ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*4;
							SpringProb = (int)SpringProb;
							if(SpringProb < 3){
								GuidePW.print("0.0 ");
							}
							else if(SpringProb == 3){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
						}
						
					}
					else if(fallProb == 1){
						double fallsport = generator.nextDouble();
						fallsport = fallsport*6 + 1;
						fallsport = (int)fallsport;
						if(gender == 1.0){
							if(fallsport == 2.0 || fallsport == 5.0){
								do{
									fallsport = generator.nextDouble();
									fallsport = fallsport*6 + 1;
									fallsport = (int)fallsport;
								} while(fallsport == 2.0 || fallsport == 5.0);
							}
						}
						else if(gender == 0.0){
							if(fallsport == 3.0 || fallsport == 6.0){
								do{
									fallsport = generator.nextDouble();
									fallsport = fallsport*6 + 1;
									fallsport = (int)fallsport;
								} while(fallsport == 3.0 || fallsport == 6.0);
							}
						}
						GuidePW.print(fallsport + " ");
						double WinterProb = generator.nextDouble();
						WinterProb = WinterProb*4;
						WinterProb = (int)WinterProb;
						if(WinterProb < 3){
							GuidePW.print("0.0 ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*4;
							SpringProb = (int)SpringProb;
							if(SpringProb < 3){
								GuidePW.print("0.0 ");
							}
							if(SpringProb == 3){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
						}
						if(WinterProb == 3){
							double wintersport = generator.nextDouble();
							wintersport = wintersport*6 + 1;
							wintersport = (int)wintersport;
							if(gender == 0.0){
								if(wintersport == 6.0){
									do{
										wintersport = generator.nextDouble();
										wintersport = wintersport*6 + 1;
										wintersport = (int)wintersport;
									} while(wintersport == 6.0);
								}
							}
							GuidePW.print(wintersport + " ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*10;
							SpringProb = (int)SpringProb;
							if(SpringProb == 0){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
							else if(SpringProb > 0){
								GuidePW.print("0.0 ");
							}
						}
					}
					//Clubs: Dance, Music, Math/Science, Debate/Public Speaking, Language, Culture
					double club1Prob = generator.nextDouble();
					club1Prob = club1Prob*5;
					club1Prob = (int)club1Prob;
					if(club1Prob == 0){
						GuidePW.print("0.0 0.0 ");
					}
					else if(club1Prob > 0){
						double club1 = generator.nextDouble();
						club1 = club1*7+1;
						club1 = (int)club1;
						GuidePW.print(club1 + " ");
						double club2Prob = generator.nextDouble();
						club2Prob = club2Prob*5;
						club2Prob = (int)club2Prob;
						if(club2Prob < 2){
							GuidePW.print("0.0 ");
						}
						else if(club2Prob >= 2){
							double club2 = generator.nextDouble();
							club2 = club2*7+1;
							club2 = (int)club2;
							if(club1 == club2){
								do{
									club2 = generator.nextDouble();
									club2 = club2*7+1;
									club2 = (int)club2;
								} while(club1 == club2);
							}
							GuidePW.print(club2 + " ");
						}
					}
					double boardingProb = generator.nextDouble();
					boardingProb = boardingProb*5;
					boardingProb = (int)boardingProb;
					if(boardingProb == 0){
						GuidePW.print("no ");
					}
					else if(boardingProb > 0){
						GuidePW.print("yes ");
					}
					GuidePW.println();
				}
			}
			if(b == 3){
				for(int c = 0; c < GuideNum; c++){
					GuidePW.print("Senior"+"_" + c + " ");
					// Free periods
					double Free = generator.nextDouble();
					Free = Free*8;
					Free = (int)Free;
					if(Free == 0){
						GuidePW.print("A_T_");
						Auxiliary1 = "T";
						FreePeriod1 = "A_T_";
					}
					if(Free == 1){
						GuidePW.print("B_U_");
						Auxiliary1 = "U";
						FreePeriod1 = "B_U_";
					}
					if(Free == 2){
						GuidePW.print("C_V_");
						Auxiliary1 = "V";
						FreePeriod1 = "C_V_";
					}
					if(Free == 3){
						GuidePW.print("D_W_");
						Auxiliary1 = "W";
						FreePeriod1 = "D_W_";
					}
					if(Free == 4){
						GuidePW.print("E_X_");
						Auxiliary1 = "X";
						FreePeriod1 = "E_X_";
					}
					if(Free == 5){
						GuidePW.print("F_Y_");
						Auxiliary1 = "Y";
						FreePeriod1 = "F_Y_";
					}
					if(Free == 6){
						GuidePW.print("G_Z_");
						Auxiliary1 = "Z";
						FreePeriod1 = "G_Z_";
					}
					if(Free == 7){
						GuidePW.print("H_Q_");
						Auxiliary1 = "Q";
						FreePeriod1 = "H_Q_";
					}
					double Probopt = generator.nextDouble();
					Probopt = Probopt*4;
					Probopt = (int)Probopt;
					if(Probopt == 0){
						for(int x = 0; x < 2; x++){
							double opt = generator.nextDouble();
							opt = opt*8;
							opt = (int)opt;
							if(opt == 0){
								if(x == 0){
									if(FreePeriod1.equals("A_T_")){
										x--;
									}
									else{
										GuidePW.print("A_T_");
										Auxiliary2 = "T";
										FreePeriod2 = "A_T_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("A_T_") || FreePeriod2.equals("A_T_")){
										x--;
									}
									else{
										GuidePW.print("A_T_");
										Auxiliary3 = "T";
									}
								}
							}
							if(opt == 1){
								if(x == 0){
									if(FreePeriod1.equals("B_U_")){
										x--;
									}
									else{
										GuidePW.print("B_U_");
										Auxiliary2 = "U";
										FreePeriod2 = "B_U_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("B_U_") || FreePeriod2.equals("B_U_")){
										x--;
									}
									else{
										GuidePW.print("B_U_");
										Auxiliary3 = "U";
									}
								}
							}
							if(opt == 2){
								if(x == 0){
									if(FreePeriod1.equals("C_V_")){
										x--;
									}
									else{
										GuidePW.print("C_V_");
										Auxiliary2 = "V";
										FreePeriod2 = "C_V_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("C_V_") || FreePeriod2.equals("C_V_")){
										x--;
									}
									else{
										GuidePW.print("C_V_");
										Auxiliary3 = "V";
									}
								}
							}
							if(opt == 3){
								if(x == 0){
									if(FreePeriod1.equals("D_W_")){
										x--;
									}
									else{
										GuidePW.print("D_W_");
										Auxiliary2 = "W";
										FreePeriod2 = "D_W_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("D_W_") || FreePeriod2.equals("D_W_")){
										x--;
									}
									else{
										GuidePW.print("D_W_");
										Auxiliary3 = "W";
									}
								}
							}
							if(opt == 4){
								if(x == 0){
									if(FreePeriod1.equals("E_X_")){
										x--;
									}
									else{
										GuidePW.print("E_X_");
										Auxiliary2 = "X";
										FreePeriod2 = "E_X_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("E_X_") || FreePeriod2.equals("E_X_")){
										x--;
									}
									else{
										GuidePW.print("E_X_");
										Auxiliary3 = "X";
									}
								}
							}
							if(opt == 5){
								if(x == 0){
									if(FreePeriod1.equals("F_Y_")){
										x--;
									}
									else{
										GuidePW.print("F_Y_");
										Auxiliary2 = "Y";
										FreePeriod2 = "F_Y_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("F_Y_") || FreePeriod2.equals("F_Y_")){
										x--;
									}
									else{
										GuidePW.print("F_Y_");
										Auxiliary3 = "Y";
									}
								}
							}
							if(opt == 6){
								if(x == 0){
									if(FreePeriod1.equals("G_Z_")){
										x--;
									}
									else{
										GuidePW.print("G_Z_");
										Auxiliary2 = "Z";
										FreePeriod2 = "G_Z_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("G_Z_") || FreePeriod2.equals("G_Z_")){
										x--;
									}
									else{
										GuidePW.print("G_Z_");
										Auxiliary3 = "Z";
									}
								}
							}
							if(opt == 7){
								if(x == 0){
									if(FreePeriod1.equals("H_Q_")){
										x--;
									}
									else{
										GuidePW.print("H_Q_");
										Auxiliary2 = "Q";
										FreePeriod2 = "H_Q_";
									}
								}
								if(x == 1){
									if(FreePeriod1.equals("H_Q_") || FreePeriod2.equals("H_Q_")){
										x--;
									}
									else{
										GuidePW.print("H_Q_");
										Auxiliary3 = "Q";
									}
								}
							}
						}
					}
					double numAuxiliary = generator.nextDouble();
					numAuxiliary = numAuxiliary*2;
					numAuxiliary = (int)numAuxiliary;
					for(int e = 0; e < 3 + numAuxiliary; e++){
						double Auxiliary = generator.nextDouble();
						Auxiliary = Auxiliary*8;
						Auxiliary = (int)Auxiliary;
						if(e == 0){
							if(Auxiliary == 0){
								if(Auxiliary1.equals("T") || Auxiliary2.equals("T") || Auxiliary3.equals("T")){
									e--;
								}
								else{
									GuidePW.print("T_");
									Auxiliary4 = "T";
								}
							}
							if(Auxiliary == 1){
								if(Auxiliary1.equals("U") || Auxiliary2.equals("U") || Auxiliary3.equals("U")){
									e--;
								}
								else{
									GuidePW.print("U_");
									Auxiliary4 = "U";
								}
							}
							if(Auxiliary == 2){
								if(Auxiliary1.equals("V") || Auxiliary2.equals("V") || Auxiliary3.equals("V")){
									e--;
								}
								else{
									GuidePW.print("V_");
									Auxiliary4 = "V";
								}
							}
							if(Auxiliary == 3){
								if(Auxiliary1.equals("W") || Auxiliary2.equals("W") || Auxiliary3.equals("W")){
									e--;
								}
								else{
									GuidePW.print("W_");
									Auxiliary4 = "W";
								}
							}
							if(Auxiliary == 4){
								if(Auxiliary1.equals("X") || Auxiliary2.equals("X") || Auxiliary3.equals("X")){
									e--;
								}
								else{
									GuidePW.print("X_");
									Auxiliary4 = "X";
								}
							}
							if(Auxiliary == 5){
								if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y") || Auxiliary3.equals("Y")){
									e--;
								}
								else{
									GuidePW.print("Y_");
									Auxiliary4 = "Y";
								}
							}
							if(Auxiliary == 6){
								if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z") || Auxiliary3.equals("Z")){
									e--;
								}
								else{
									GuidePW.print("Z_");
									Auxiliary4 = "Z";
								}
							}
							if(Auxiliary == 7){
								if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q") || Auxiliary3.equals("Q")){
									e--;
								}
								else{
									GuidePW.print("Q_");
									Auxiliary4 = "Q";
								}
							}
						}
						else if(e == 1){
							if(Auxiliary == 0){
								if(Auxiliary1.equals("T") || Auxiliary2.equals("T") || Auxiliary3.equals("T") || Auxiliary4.equals("T")){
									e--;
								}
								else{
									GuidePW.print("T_");
									Auxiliary5 = "T";
								}
							}
							else if(Auxiliary == 1){
								if(Auxiliary1.equals("U") || Auxiliary2.equals("U") || Auxiliary3.equals("U") || Auxiliary4.equals("U")){
									e--;
								}
								else{
									GuidePW.print("U_");
									Auxiliary5 = "U";
								}
							}
							if(Auxiliary == 2){
								if(Auxiliary1.equals("V") || Auxiliary2.equals("V") || Auxiliary3.equals("V") || Auxiliary4.equals("V")){
									e--;
								}
								else{
									GuidePW.print("V_");
									Auxiliary5 = "V";
								}
							}
							if(Auxiliary == 3){
								if(Auxiliary1.equals("W") || Auxiliary2.equals("W") || Auxiliary3.equals("W") || Auxiliary4.equals("W")){
									e--;
								}
								else{
									GuidePW.print("W_");
									Auxiliary5 = "W";
								}
							}
							if(Auxiliary == 4){
								if(Auxiliary1.equals("X") || Auxiliary2.equals("X") || Auxiliary3.equals("X") || Auxiliary4.equals("X")){
									e--;
								}
								else{
									GuidePW.print("X_");
									Auxiliary5 = "X";
								}
							}
							if(Auxiliary == 5){
								if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y") || Auxiliary3.equals("Y") || Auxiliary4.equals("Y")){
									e--;
								}
								else{
									GuidePW.print("Y_");
									Auxiliary5 = "Y";
								}
							}
							if(Auxiliary == 6){
								if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z") || Auxiliary3.equals("Z") || Auxiliary4.equals("Z")){
									e--;
								}
								else{
									GuidePW.print("Z_");
									Auxiliary5 = "Z";
								}
							}
							if(Auxiliary == 7){
								if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q") || Auxiliary3.equals("Q") || Auxiliary4.equals("Q")){
									e--;
								}
								else{
									GuidePW.print("Q_");
									Auxiliary5 = "Q";
								}
							}
						}
						if(e == 2){	
							if(Auxiliary == 0){
								if(Auxiliary1.equals("T") || Auxiliary2.equals("T") || Auxiliary3.equals("T") || Auxiliary4.equals("T") || Auxiliary5.equals("T")){
									e--;
								}
								else{
									GuidePW.print("T_");
									Auxiliary6 = "T";
								}
							}
							else if(Auxiliary == 1){
								if(Auxiliary1.equals("U") || Auxiliary2.equals("U") || Auxiliary3.equals("U") || Auxiliary4.equals("U") || Auxiliary5.equals("U")){
									e--;
								}
								else{
									GuidePW.print("U_");
									Auxiliary6 = "U";
								}
							}
							if(Auxiliary == 2){
								if(Auxiliary1.equals("V") || Auxiliary2.equals("V") || Auxiliary3.equals("V") || Auxiliary4.equals("V") || Auxiliary5.equals("V")){
									e--;
								}
								else{
									GuidePW.print("V_");
									Auxiliary6 = "V";
								}
							}
							if(Auxiliary == 3){
								if(Auxiliary1.equals("W") || Auxiliary2.equals("W") || Auxiliary3.equals("W") || Auxiliary4.equals("W") || Auxiliary5.equals("W")){
									e--;
								}
								else{
									GuidePW.print("W_");
									Auxiliary6 = "W";
								}
							}
							if(Auxiliary == 4){
								if(Auxiliary1.equals("X") || Auxiliary2.equals("X") || Auxiliary3.equals("X") || Auxiliary4.equals("X") || Auxiliary5.equals("X")){
									e--;
								}
								else{
									GuidePW.print("X_");
									Auxiliary6 = "X";
								}
							}
							if(Auxiliary == 5){
								if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y") || Auxiliary3.equals("Y") || Auxiliary4.equals("Y") || Auxiliary5.equals("Y")){
									e--;
								}
								else{
									GuidePW.print("Y_");
									Auxiliary6 = "Y";
								}
							}
							if(Auxiliary == 6){
								if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z") || Auxiliary3.equals("Z") || Auxiliary4.equals("Z") || Auxiliary5.equals("Z")){
									e--;
								}
								else{
									GuidePW.print("Z_");
									Auxiliary6 = "Z";
								}
							}
							if(Auxiliary == 7){
								if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q") || Auxiliary3.equals("Q") || Auxiliary4.equals("Q") || Auxiliary5.equals("Q")){
									e--;
								}
								else{
									GuidePW.print("Q_");
									Auxiliary6 = "Q";
								}
							}
						}
						if(numAuxiliary == 1){
							if(e == 3){
								if(Auxiliary == 0){
									if(Auxiliary1.equals("T") || Auxiliary2.equals("T") || Auxiliary3.equals("T") || Auxiliary4.equals("T") || Auxiliary5.equals("T") || Auxiliary6.equals("T")){
										e--;
									}
									else{
										GuidePW.print("T_ ");
									}
								}
								else if(Auxiliary == 1){
									if(Auxiliary1.equals("U") || Auxiliary2.equals("U") || Auxiliary3.equals("U") || Auxiliary4.equals("U") || Auxiliary5.equals("U") || Auxiliary6.equals("U")){
										e--;
									}
									else{
										GuidePW.print("U_ ");
									}
								}
								if(Auxiliary == 2){
									if(Auxiliary1.equals("V") || Auxiliary2.equals("V") || Auxiliary3.equals("V") || Auxiliary4.equals("V") || Auxiliary5.equals("V") || Auxiliary6.equals("V")){
										e--;
									}
									else{
										GuidePW.print("V_ ");
									}
								}
								if(Auxiliary == 3){
									if(Auxiliary1.equals("W") || Auxiliary2.equals("W") || Auxiliary3.equals("W") || Auxiliary4.equals("W") || Auxiliary5.equals("W") || Auxiliary6.equals("W")){
										e--;
									}
									else{
										GuidePW.print("W_ ");
									}
								}
								if(Auxiliary == 4){
									if(Auxiliary1.equals("X") || Auxiliary2.equals("X") || Auxiliary3.equals("X") || Auxiliary4.equals("X") || Auxiliary5.equals("X") || Auxiliary6.equals("X")){
										e--;
									}
									else{
										GuidePW.print("X_ ");
									}
								}
								if(Auxiliary == 5){
									if(Auxiliary1.equals("Y") || Auxiliary2.equals("Y") || Auxiliary3.equals("Y") || Auxiliary4.equals("Y") || Auxiliary5.equals("Y") || Auxiliary6.equals("Y")){
										e--;
									}
									else{
										GuidePW.print("Y_ ");
									}
								}
								if(Auxiliary == 6){
									if(Auxiliary1.equals("Z") || Auxiliary2.equals("Z") || Auxiliary3.equals("Z") || Auxiliary4.equals("Z") || Auxiliary5.equals("Z") || Auxiliary6.equals("Z")){
										e--;
									}
									else{
										GuidePW.print("Z_ ");
									}
								}
								if(Auxiliary == 7){
									if(Auxiliary1.equals("Q") || Auxiliary2.equals("Q") || Auxiliary3.equals("Q") || Auxiliary4.equals("Q") || Auxiliary5.equals("Q") || Auxiliary6.equals("Q")){
										e--;
									}
									else{
										GuidePW.print("Q_ ");
									}
								}
							}
						}
						if(numAuxiliary == 0){
							if(e == 2){
								GuidePW.print(" ");
							}
						}
					}
					double Guidecountry = generator.nextDouble();
					Guidecountry = Guidecountry*1152;
					Guidecountry = (int)Guidecountry;
					if(Guidecountry < 900){
						GuidePW.print("0.0 ");
					}
					else if(Guidecountry >= 900 && Guidecountry < 907){
						GuidePW.print("1.0 ");
					}
					else if(Guidecountry >= 907 && Guidecountry < 914){
						GuidePW.print("2.0 ");
					}
					else if(Guidecountry >= 914 && Guidecountry < 921){
						GuidePW.print("3.0 ");
					}
					else if(Guidecountry >= 921 && Guidecountry < 928){
						GuidePW.print("4.0 ");
					}
					else if(Guidecountry >= 928 && Guidecountry < 935){
						GuidePW.print("5.0 ");
					}
					else if(Guidecountry >= 935 && Guidecountry < 942){
						GuidePW.print("6.0 ");
					}
					else if(Guidecountry >= 942 && Guidecountry < 949){
						GuidePW.print("7.0 ");
					}
					else if(Guidecountry >= 949 && Guidecountry < 956){
						GuidePW.print("8.0 ");
					}
					else if(Guidecountry >= 956 && Guidecountry < 963){
						GuidePW.print("9.0 ");
					}
					else if(Guidecountry >= 963 && Guidecountry < 970){
						GuidePW.print("10.0 ");
					}
					else if(Guidecountry >= 970 && Guidecountry < 977){
						GuidePW.print("11.0 ");
					}
					else if(Guidecountry >= 977 && Guidecountry < 984){
						GuidePW.print("12.0 ");
					}
					else if(Guidecountry >= 984 && Guidecountry < 991){
						GuidePW.print("13.0 ");
					}
					else if(Guidecountry >= 991 && Guidecountry < 998){
						GuidePW.print("14.0 ");
					}
					else if(Guidecountry >= 998 && Guidecountry < 1005){
						GuidePW.print("15.0 ");
					}
					else if(Guidecountry >= 1005 && Guidecountry < 1012){
						GuidePW.print("16.0 ");
					}
					else if(Guidecountry >= 1012 && Guidecountry < 1019){
						GuidePW.print("17.0 ");
					}
					else if(Guidecountry >= 1019 && Guidecountry < 1026){
						GuidePW.print("18.0 ");
					}
					else if(Guidecountry >= 1026 && Guidecountry < 1033){
						GuidePW.print("19.0 ");
					}
					else if(Guidecountry >= 1033 && Guidecountry < 1040){
						GuidePW.print("20.0 ");
					}
					else if(Guidecountry >= 1040 && Guidecountry < 1047){
						GuidePW.print("21.0 ");
					}
					else if(Guidecountry >= 1047 && Guidecountry < 1054){
						GuidePW.print("22.0 ");
					}
					else if(Guidecountry >= 1054 && Guidecountry < 1061){
						GuidePW.print("23.0 ");
					}
					else if(Guidecountry >= 1061 && Guidecountry < 1068){
						GuidePW.print("24.0 ");
					}
					else if(Guidecountry >= 1068 && Guidecountry < 1075){
						GuidePW.print("25.0 ");
					}
					else if(Guidecountry >= 1075 && Guidecountry < 1082){
						GuidePW.print("26.0 ");
					}
					else if(Guidecountry >= 1082 && Guidecountry < 1089){
						GuidePW.print("27.0 ");
					}
					else if(Guidecountry >= 1089 && Guidecountry < 1096){
						GuidePW.print("28.0 ");
					}
					else if(Guidecountry >= 1096 && Guidecountry < 1103){
						GuidePW.print("29.0 ");
					}
					else if(Guidecountry >= 1103 && Guidecountry < 1110){
						GuidePW.print("30.0 ");
					}
					else if(Guidecountry >= 1110 && Guidecountry < 1117){
						GuidePW.print("31.0 ");
					}
					else if(Guidecountry >= 1117 && Guidecountry < 1124){
						GuidePW.print("32.0 ");
					}
					else if(Guidecountry >= 1124 && Guidecountry < 1131){
						GuidePW.print("33.0 ");
					}
					else if(Guidecountry >= 1131 && Guidecountry < 1138){
						GuidePW.print("34.0 ");
					}
					else if(Guidecountry >= 1138 && Guidecountry < 1145){
						GuidePW.print("35.0 ");
					}
					else if(Guidecountry >= 1145){
						GuidePW.print("36.0 ");
					}
					
					double gender = generator.nextDouble();
					gender = gender*2;
					gender = (int)gender;
					GuidePW.print(gender + " ");
					GuidePW.print("12 ");
					// Academic Interests: Math/Science, Humanities, Languages, Arts, All
					double academic = generator.nextDouble();
					academic = academic*100;
					academic = (int)academic;
					if(academic < 30){
						GuidePW.print("0.0 ");
					}
					else if(academic >= 30 && academic < 60){
						GuidePW.print("1.0 ");
					}
					else if(academic >= 60 && academic < 90){
						GuidePW.print("2.0 ");
					}
					else if(academic >= 90 && academic < 95){
						GuidePW.print("3.0 ");
					}
					else if(academic >= 95){
						GuidePW.print("4.0 ");
					}
					double fallProb = generator.nextDouble();
					fallProb = fallProb*2;
					fallProb = (int)fallProb;
					if(fallProb == 0){
						GuidePW.print("0.0 ");
						double WinterProb = generator.nextDouble();
						WinterProb = WinterProb*2;
						WinterProb = (int)WinterProb;
						if(WinterProb == 0){
							GuidePW.print("0.0 ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*2;
							SpringProb = (int)SpringProb;
							if(SpringProb == 0){
								GuidePW.print("0.0 ");
							}
							if(SpringProb == 1){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
						}
						else if(WinterProb == 1){
							double wintersport = generator.nextDouble();
							wintersport = wintersport*6 + 1;
							wintersport = (int)wintersport;
							if(gender == 0.0){
								if(wintersport == 6.0){
									do{
										wintersport = generator.nextDouble();
										wintersport = wintersport*6 + 1;
										wintersport = (int)wintersport;
									} while(wintersport == 6.0);
								}
							}
							GuidePW.print(wintersport + " ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*4;
							SpringProb = (int)SpringProb;
							if(SpringProb < 3){
								GuidePW.print("0.0 ");
							}
							else if(SpringProb == 3){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
						}
						
					}
					else if(fallProb == 1){
						double fallsport = generator.nextDouble();
						fallsport = fallsport*6 + 1;
						fallsport = (int)fallsport;
						if(gender == 1.0){
							if(fallsport == 2.0 || fallsport == 5.0){
								do{
									fallsport = generator.nextDouble();
									fallsport = fallsport*6 + 1;
									fallsport = (int)fallsport;
								} while(fallsport == 2.0 || fallsport == 5.0);
							}
						}
						else if(gender == 0.0){
							if(fallsport == 3.0 || fallsport == 6.0){
								do{
									fallsport = generator.nextDouble();
									fallsport = fallsport*6 + 1;
									fallsport = (int)fallsport;
								} while(fallsport == 3.0 || fallsport == 6.0);
							}
						}
						GuidePW.print(fallsport + " ");
						double WinterProb = generator.nextDouble();
						WinterProb = WinterProb*4;
						WinterProb = (int)WinterProb;
						if(WinterProb < 3){
							GuidePW.print("0.0 ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*4;
							SpringProb = (int)SpringProb;
							if(SpringProb < 3){
								GuidePW.print("0.0 ");
							}
							if(SpringProb == 3){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
						}
						if(WinterProb == 3){
							double wintersport = generator.nextDouble();
							wintersport = wintersport*6 + 1;
							wintersport = (int)wintersport;
							if(gender == 0.0){
								if(wintersport == 6.0){
									do{
										wintersport = generator.nextDouble();
										wintersport = wintersport*6 + 1;
										wintersport = (int)wintersport;
									} while(wintersport == 6.0);
								}
							}
							GuidePW.print(wintersport + " ");
							double SpringProb = generator.nextDouble();
							SpringProb = SpringProb*10;
							SpringProb = (int)SpringProb;
							if(SpringProb == 0){
								double springsport = generator.nextDouble();
								springsport = springsport*9 + 1;
								springsport = (int)springsport;
								if(gender == 1.0){
									if(springsport == 6.0 || springsport == 9.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 6.0 || springsport == 9.0);
									}
								}
								else if(gender == 0.0){
									if(springsport == 1.0){
										do{
											springsport = generator.nextDouble();
											springsport = springsport*9 + 1;
											springsport = (int)springsport;
										} while(springsport == 1.0);
									}
								}
								GuidePW.print(springsport + " ");
							}
							else if(SpringProb > 0){
								GuidePW.print("0.0 ");
							}
						}
					}
					//Clubs: Dance, Music, Math/Science, Debate/Public Speaking, Language, Culture
					double club1Prob = generator.nextDouble();
					club1Prob = club1Prob*5;
					club1Prob = (int)club1Prob;
					if(club1Prob == 0){
						GuidePW.print("0.0 0.0 ");
					}
					else if(club1Prob > 0){
						double club1 = generator.nextDouble();
						club1 = club1*7+1;
						club1 = (int)club1;
						GuidePW.print(club1 + " ");
						double club2Prob = generator.nextDouble();
						club2Prob = club2Prob*5;
						club2Prob = (int)club2Prob;
						if(club2Prob < 2){
							GuidePW.print("0.0 ");
						}
						else if(club2Prob >= 2){
							double club2 = generator.nextDouble();
							club2 = club2*7+1;
							club2 = (int)club2;
							if(club1 == club2){
								do{
									club2 = generator.nextDouble();
									club2 = club2*7+1;
									club2 = (int)club2;
								} while(club1 == club2);
							}
							GuidePW.print(club2 + " ");
						}
					}
					double boardingProb = generator.nextDouble();
					boardingProb = boardingProb*5;
					boardingProb = (int)boardingProb;
					if(boardingProb == 0){
						GuidePW.print("no ");
					}
					else if(boardingProb > 0){
						GuidePW.print("yes ");
					}
					GuidePW.println();
				}
			}
		}
		GuidePW.close();
		}
		 catch (IOException u) {
				return;
			}
}
}