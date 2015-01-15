import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class RandomGen {

	public static void main(String args[]){
		
		
		try{
		
		Random generator = new Random();
			
		for(int a = 0; a < 6; a++){
			if(a==0){
				File Monday = new File("Monday" + "_" + "8" + "_" + "23" + ".txt");
				FileWriter Mondaywriter = new FileWriter(Monday, false);
				PrintWriter MondayPW = new PrintWriter(Mondaywriter);
				for(int b = 0; b < 5; b++){
					double tourNum = generator.nextDouble();
					tourNum = 5;
					tourNum = (int)tourNum;
					for(int c = 0; c < tourNum; c++){
						MondayPW.print("Monday"+"_"+ b + "_" + c + " ");
						MondayPW.print("September 23 2013 ");
						if(b == 0){
							MondayPW.print("8:00 U ");
						}
						else if(b==1){
							MondayPW.print("9:50 Break ");
						}
						else if(b==2){
							MondayPW.print("12:55 Break ");
						}
						else if(b==3){
							MondayPW.print("3:00 F ");
						}
						else if(b==4){
							MondayPW.print("4:15 Z ");
						}
						double Mondaycountry = generator.nextDouble();
						Mondaycountry = Mondaycountry*1152;
						Mondaycountry = (int)Mondaycountry;
						if(Mondaycountry < 900){
							MondayPW.print("0.0 ");
						}
						else if(Mondaycountry >= 900 && Mondaycountry < 907){
							MondayPW.print("1.0 ");
						}
						else if(Mondaycountry >= 907 && Mondaycountry < 914){
							MondayPW.print("2.0 ");
						}
						else if(Mondaycountry >= 914 && Mondaycountry < 921){
							MondayPW.print("3.0 ");
						}
						else if(Mondaycountry >= 921 && Mondaycountry < 928){
							MondayPW.print("4.0 ");
						}
						else if(Mondaycountry >= 928 && Mondaycountry < 935){
							MondayPW.print("5.0 ");
						}
						else if(Mondaycountry >= 935 && Mondaycountry < 942){
							MondayPW.print("6.0 ");
						}
						else if(Mondaycountry >= 942 && Mondaycountry < 949){
							MondayPW.print("7.0 ");
						}
						else if(Mondaycountry >= 949 && Mondaycountry < 956){
							MondayPW.print("8.0 ");
						}
						else if(Mondaycountry >= 956 && Mondaycountry < 963){
							MondayPW.print("9.0 ");
						}
						else if(Mondaycountry >= 963 && Mondaycountry < 970){
							MondayPW.print("10.0 ");
						}
						else if(Mondaycountry >= 970 && Mondaycountry < 977){
							MondayPW.print("11.0 ");
						}
						else if(Mondaycountry >= 977 && Mondaycountry < 984){
							MondayPW.print("12.0 ");
						}
						else if(Mondaycountry >= 984 && Mondaycountry < 991){
							MondayPW.print("13.0 ");
						}
						else if(Mondaycountry >= 991 && Mondaycountry < 998){
							MondayPW.print("14.0 ");
						}
						else if(Mondaycountry >= 998 && Mondaycountry < 1005){
							MondayPW.print("15.0 ");
						}
						else if(Mondaycountry >= 1005 && Mondaycountry < 1012){
							MondayPW.print("16.0 ");
						}
						else if(Mondaycountry >= 1012 && Mondaycountry < 1019){
							MondayPW.print("17.0 ");
						}
						else if(Mondaycountry >= 1019 && Mondaycountry < 1026){
							MondayPW.print("18.0 ");
						}
						else if(Mondaycountry >= 1026 && Mondaycountry < 1033){
							MondayPW.print("19.0 ");
						}
						else if(Mondaycountry >= 1033 && Mondaycountry < 1040){
							MondayPW.print("20.0 ");
						}
						else if(Mondaycountry >= 1040 && Mondaycountry < 1047){
							MondayPW.print("21.0 ");
						}
						else if(Mondaycountry >= 1047 && Mondaycountry < 1054){
							MondayPW.print("22.0 ");
						}
						else if(Mondaycountry >= 1054 && Mondaycountry < 1061){
							MondayPW.print("23.0 ");
						}
						else if(Mondaycountry >= 1061 && Mondaycountry < 1068){
							MondayPW.print("24.0 ");
						}
						else if(Mondaycountry >= 1068 && Mondaycountry < 1075){
							MondayPW.print("25.0 ");
						}
						else if(Mondaycountry >= 1075 && Mondaycountry < 1082){
							MondayPW.print("26.0 ");
						}
						else if(Mondaycountry >= 1082 && Mondaycountry < 1089){
							MondayPW.print("27.0 ");
						}
						else if(Mondaycountry >= 1089 && Mondaycountry < 1096){
							MondayPW.print("28.0 ");
						}
						else if(Mondaycountry >= 1096 && Mondaycountry < 1103){
							MondayPW.print("29.0 ");
						}
						else if(Mondaycountry >= 1103 && Mondaycountry < 1110){
							MondayPW.print("30.0 ");
						}
						else if(Mondaycountry >= 1110 && Mondaycountry < 1117){
							MondayPW.print("31.0 ");
						}
						else if(Mondaycountry >= 1117 && Mondaycountry < 1124){
							MondayPW.print("32.0 ");
						}
						else if(Mondaycountry >= 1124 && Mondaycountry < 1131){
							MondayPW.print("33.0 ");
						}
						else if(Mondaycountry >= 1131 && Mondaycountry < 1138){
							MondayPW.print("34.0 ");
						}
						else if(Mondaycountry >= 1138 && Mondaycountry < 1145){
							MondayPW.print("35.0 ");
						}
						else if(Mondaycountry >= 1145){
							MondayPW.print("36.0 ");
						}
						
						double gender = generator.nextDouble();
						gender = gender*2;
						gender = (int)gender;
						MondayPW.print(gender + " ");
						double GradeNum = generator.nextDouble();
						GradeNum = GradeNum*1000;
						GradeNum = (int)GradeNum;
						if(GradeNum < 500){
							MondayPW.print("9 ");
						}
						else if(GradeNum >= 500 && GradeNum < 800){
							MondayPW.print("10 ");
						}
						else if(GradeNum >= 800 && GradeNum < 900){
							MondayPW.print("11 ");
						}
						else if(GradeNum >= 900 && GradeNum < 950){
							MondayPW.print("12 ");
						}
						else if(GradeNum >= 950){
							MondayPW.print("PG ");
						}
						// Academic Interests: Math/Science, Humanities, Languages, Arts, All
						double academic = generator.nextDouble();
						academic = academic*100;
						academic = (int)academic;
						if(academic < 30){
							MondayPW.print("0.0 ");
						}
						else if(academic >= 30 && academic < 60){
							MondayPW.print("1.0 ");
						}
						else if(academic >= 60 && academic < 90){
							MondayPW.print("2.0 ");
						}
						else if(academic >= 90 && academic < 95){
							MondayPW.print("3.0 ");
						}
						else if(academic >= 95){
							MondayPW.print("4.0 ");
						}
						double fallProb = generator.nextDouble();
						fallProb = fallProb*2;
						fallProb = (int)fallProb;
						if(fallProb == 0){
							MondayPW.print("0.0 ");
							double WinterProb = generator.nextDouble();
							WinterProb = WinterProb*2;
							WinterProb = (int)WinterProb;
							if(WinterProb == 0){
								MondayPW.print("0.0 ");
								double SpringProb = generator.nextDouble();
								SpringProb = SpringProb*2;
								SpringProb = (int)SpringProb;
								if(SpringProb == 0){
									MondayPW.print("0.0 ");
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
									MondayPW.print(springsport + " ");
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
								MondayPW.print(wintersport + " ");
								double SpringProb = generator.nextDouble();
								SpringProb = SpringProb*4;
								SpringProb = (int)SpringProb;
								if(SpringProb < 3){
									MondayPW.print("0.0 ");
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
									MondayPW.print(springsport + " ");
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
							MondayPW.print(fallsport + " ");
							double WinterProb = generator.nextDouble();
							WinterProb = WinterProb*4;
							WinterProb = (int)WinterProb;
							if(WinterProb < 3){
								MondayPW.print("0.0 ");
								double SpringProb = generator.nextDouble();
								SpringProb = SpringProb*4;
								SpringProb = (int)SpringProb;
								if(SpringProb < 3){
									MondayPW.print("0.0 ");
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
									MondayPW.print(springsport + " ");
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
								MondayPW.print(wintersport + " ");
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
									MondayPW.print(springsport + " ");
								}
								else if(SpringProb > 0){
									MondayPW.print("0.0 ");
								}
							}
						}
						//Clubs: Dance, Music, Math/Science, Debate/Public Speaking, Language, Culture
						double club1Prob = generator.nextDouble();
						club1Prob = club1Prob*5;
						club1Prob = (int)club1Prob;
						if(club1Prob == 0){
							MondayPW.print("0.0 0.0 ");
						}
						else if(club1Prob > 0){
							double club1 = generator.nextDouble();
							club1 = club1*7+1;
							club1 = (int)club1;
							MondayPW.print(club1 + " ");
							double club2Prob = generator.nextDouble();
							club2Prob = club2Prob*5;
							club2Prob = (int)club2Prob;
							if(club2Prob < 2){
								MondayPW.print("0.0 ");
							}
							else if(club2Prob >= 2){
								double club2 = generator.nextDouble();
								club2 = club2*7+1;
								club2 = (int)club2;
								if(club1 == club2){
									while(club1 == club2){
										club2 = generator.nextDouble();
										club2 = club2*7+1;
										club2 = (int)club2;
									}
								}
								MondayPW.print(club2 + " ");
							}
						}
						double boardingProb = generator.nextDouble();
						boardingProb = boardingProb*5;
						boardingProb = (int)boardingProb;
						if(boardingProb == 0){
							MondayPW.print("no ");
						}
						else if(boardingProb > 0){
							MondayPW.print("yes ");
						}
						double tourProb = generator.nextDouble();
						tourProb = tourProb*100;
						tourProb = (int)tourProb;
						if(tourProb < 90){
							MondayPW.print("yes yes ");
						}
						else if(tourProb >= 90 && tourProb < 95){
							MondayPW.print("yes no ");
						}
						else if(tourProb >= 95){
							MondayPW.print("no yes ");
						}
						
						MondayPW.print("null");
						MondayPW.println();
					}
				}
				MondayPW.close();
			}
			
				if(a==1){
					File Tuesday = new File("Tuesday" + "_" + "8" + "_" + "24" + ".txt");
					FileWriter Tuesdaywriter = new FileWriter(Tuesday, false);
					PrintWriter TuesdayPW = new PrintWriter(Tuesdaywriter);
					for(int b = 0; b < 6; b++){
						double TuesdaytourNum = generator.nextDouble();
						TuesdaytourNum = 5;
						TuesdaytourNum = (int)TuesdaytourNum;
						for(int c = 0; c < TuesdaytourNum; c++){
							TuesdayPW.print("Tuesday"+"_"+ b + "_" + c + " ");
							TuesdayPW.print("September 24 2013 ");
							if(b == 0){
								TuesdayPW.print("8:00 T ");
							}
							else if(b==1){
								TuesdayPW.print("10:45 C ");
							}
							else if(b==2){
								TuesdayPW.print("12:55 Break ");
							}
							else if(b==3){
								TuesdayPW.print("1:40 E ");
							}
							else if(b==4){
								TuesdayPW.print("3:45 G ");
							}
							else if(b==5){
								TuesdayPW.print("4:15 G ");
							}
							double Tuesdaycountry = generator.nextDouble();
							Tuesdaycountry = Tuesdaycountry*1152;
							Tuesdaycountry = (int)Tuesdaycountry;
							if(Tuesdaycountry < 900){
								TuesdayPW.print("0.0 ");
							}
							else if(Tuesdaycountry >= 900 && Tuesdaycountry < 907){
								TuesdayPW.print("1.0 ");
							}
							else if(Tuesdaycountry >= 907 && Tuesdaycountry < 914){
								TuesdayPW.print("2.0 ");
							}
							else if(Tuesdaycountry >= 914 && Tuesdaycountry < 921){
								TuesdayPW.print("3.0 ");
							}
							else if(Tuesdaycountry >= 921 && Tuesdaycountry < 928){
								TuesdayPW.print("4.0 ");
							}
							else if(Tuesdaycountry >= 928 && Tuesdaycountry < 935){
								TuesdayPW.print("5.0 ");
							}
							else if(Tuesdaycountry >= 935 && Tuesdaycountry < 942){
								TuesdayPW.print("6.0 ");
							}
							else if(Tuesdaycountry >= 942 && Tuesdaycountry < 949){
								TuesdayPW.print("7.0 ");
							}
							else if(Tuesdaycountry >= 949 && Tuesdaycountry < 956){
								TuesdayPW.print("8.0 ");
							}
							else if(Tuesdaycountry >= 956 && Tuesdaycountry < 963){
								TuesdayPW.print("9.0 ");
							}
							else if(Tuesdaycountry >= 963 && Tuesdaycountry < 970){
								TuesdayPW.print("10.0 ");
							}
							else if(Tuesdaycountry >= 970 && Tuesdaycountry < 977){
								TuesdayPW.print("11.0 ");
							}
							else if(Tuesdaycountry >= 977 && Tuesdaycountry < 984){
								TuesdayPW.print("12.0 ");
							}
							else if(Tuesdaycountry >= 984 && Tuesdaycountry < 991){
								TuesdayPW.print("13.0 ");
							}
							else if(Tuesdaycountry >= 991 && Tuesdaycountry < 998){
								TuesdayPW.print("14.0 ");
							}
							else if(Tuesdaycountry >= 998 && Tuesdaycountry < 1005){
								TuesdayPW.print("15.0 ");
							}
							else if(Tuesdaycountry >= 1005 && Tuesdaycountry < 1012){
								TuesdayPW.print("16.0 ");
							}
							else if(Tuesdaycountry >= 1012 && Tuesdaycountry < 1019){
								TuesdayPW.print("17.0 ");
							}
							else if(Tuesdaycountry >= 1019 && Tuesdaycountry < 1026){
								TuesdayPW.print("18.0 ");
							}
							else if(Tuesdaycountry >= 1026 && Tuesdaycountry < 1033){
								TuesdayPW.print("19.0 ");
							}
							else if(Tuesdaycountry >= 1033 && Tuesdaycountry < 1040){
								TuesdayPW.print("20.0 ");
							}
							else if(Tuesdaycountry >= 1040 && Tuesdaycountry < 1047){
								TuesdayPW.print("21.0 ");
							}
							else if(Tuesdaycountry >= 1047 && Tuesdaycountry < 1054){
								TuesdayPW.print("22.0 ");
							}
							else if(Tuesdaycountry >= 1054 && Tuesdaycountry < 1061){
								TuesdayPW.print("23.0 ");
							}
							else if(Tuesdaycountry >= 1061 && Tuesdaycountry < 1068){
								TuesdayPW.print("24.0 ");
							}
							else if(Tuesdaycountry >= 1068 && Tuesdaycountry < 1075){
								TuesdayPW.print("25.0 ");
							}
							else if(Tuesdaycountry >= 1075 && Tuesdaycountry < 1082){
								TuesdayPW.print("26.0 ");
							}
							else if(Tuesdaycountry >= 1082 && Tuesdaycountry < 1089){
								TuesdayPW.print("27.0 ");
							}
							else if(Tuesdaycountry >= 1089 && Tuesdaycountry < 1096){
								TuesdayPW.print("28.0 ");
							}
							else if(Tuesdaycountry >= 1096 && Tuesdaycountry < 1103){
								TuesdayPW.print("29.0 ");
							}
							else if(Tuesdaycountry >= 1103 && Tuesdaycountry < 1110){
								TuesdayPW.print("30.0 ");
							}
							else if(Tuesdaycountry >= 1110 && Tuesdaycountry < 1117){
								TuesdayPW.print("31.0 ");
							}
							else if(Tuesdaycountry >= 1117 && Tuesdaycountry < 1124){
								TuesdayPW.print("32.0 ");
							}
							else if(Tuesdaycountry >= 1124 && Tuesdaycountry < 1131){
								TuesdayPW.print("33.0 ");
							}
							else if(Tuesdaycountry >= 1131 && Tuesdaycountry < 1138){
								TuesdayPW.print("34.0 ");
							}
							else if(Tuesdaycountry >= 1138 && Tuesdaycountry < 1145){
								TuesdayPW.print("35.0 ");
							}
							else if(Tuesdaycountry >= 1145){
								TuesdayPW.print("36.0 ");
							}
							
							double gender = generator.nextDouble();
							gender = gender*2;
							gender = (int)gender;
							TuesdayPW.print(gender + " ");
							double GradeNum = generator.nextDouble();
							GradeNum = GradeNum*1000;
							GradeNum = (int)GradeNum;
							if(GradeNum < 500){
								TuesdayPW.print("9 ");
							}
							else if(GradeNum >= 500 && GradeNum < 800){
								TuesdayPW.print("10 ");
							}
							else if(GradeNum >= 800 && GradeNum < 900){
								TuesdayPW.print("11 ");
							}
							else if(GradeNum >= 900 && GradeNum < 950){
								TuesdayPW.print("12 ");
							}
							else if(GradeNum >= 950){
								TuesdayPW.print("PG ");
							}
							// Academic Interests: Math/Science, Humanities, Languages, Arts, All
							double academic = generator.nextDouble();
							academic = academic*100;
							academic = (int)academic;
							if(academic < 30){
								TuesdayPW.print("0.0 ");
							}
							else if(academic >= 30 && academic < 60){
								TuesdayPW.print("1.0 ");
							}
							else if(academic >= 60 && academic < 90){
								TuesdayPW.print("2.0 ");
							}
							else if(academic >= 90 && academic < 95){
								TuesdayPW.print("3.0 ");
							}
							else if(academic >= 95){
								TuesdayPW.print("4.0 ");
							}
							double fallProb = generator.nextDouble();
							fallProb = fallProb*2;
							fallProb = (int)fallProb;
							if(fallProb == 0){
								TuesdayPW.print("0.0 ");
								double WinterProb = generator.nextDouble();
								WinterProb = WinterProb*2;
								WinterProb = (int)WinterProb;
								if(WinterProb == 0){
									TuesdayPW.print("0.0 ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*2;
									SpringProb = (int)SpringProb;
									if(SpringProb == 0){
										TuesdayPW.print("0.0 ");
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
										TuesdayPW.print(springsport + " ");
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
									TuesdayPW.print(wintersport + " ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*4;
									SpringProb = (int)SpringProb;
									if(SpringProb < 3){
										TuesdayPW.print("0.0 ");
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
										TuesdayPW.print(springsport + " ");
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
								TuesdayPW.print(fallsport + " ");
								double WinterProb = generator.nextDouble();
								WinterProb = WinterProb*4;
								WinterProb = (int)WinterProb;
								if(WinterProb < 3){
									TuesdayPW.print("0.0 ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*4;
									SpringProb = (int)SpringProb;
									if(SpringProb < 3){
										TuesdayPW.print("0.0 ");
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
										TuesdayPW.print(springsport + " ");
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
									TuesdayPW.print(wintersport + " ");
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
										TuesdayPW.print(springsport + " ");
									}
									else if(SpringProb > 0){
										TuesdayPW.print("0.0 ");
									}
								}
							}
							//Clubs: Dance, Music, Math/Science, Debate/Public Speaking, Language, Culture
							double club1Prob = generator.nextDouble();
							club1Prob = club1Prob*5;
							club1Prob = (int)club1Prob;
							if(club1Prob == 0){
								TuesdayPW.print("0.0 0.0 ");
							}
							else if(club1Prob > 0){
								double club1 = generator.nextDouble();
								club1 = club1*7+1;
								club1 = (int)club1;
								TuesdayPW.print(club1 + " ");
								double club2Prob = generator.nextDouble();
								club2Prob = club2Prob*5;
								club2Prob = (int)club2Prob;
								if(club2Prob < 2){
									TuesdayPW.print("0.0 ");
								}
								else if(club2Prob >= 2){
									double club2 = generator.nextDouble();
									club2 = club2*7+1;
									club2 = (int)club2;
									if(club1 == club2){
										while(club1 == club2){
											club2 = generator.nextDouble();
											club2 = club2*7+1;
											club2 = (int)club2;
										}
									}
									TuesdayPW.print(club2 + " ");
								}
							}
							double boardingProb = generator.nextDouble();
							boardingProb = boardingProb*5;
							boardingProb = (int)boardingProb;
							if(boardingProb == 0){
								TuesdayPW.print("no ");
							}
							else if(boardingProb > 0){
								TuesdayPW.print("yes ");
							}
							double tourProb = generator.nextDouble();
							tourProb = tourProb*100;
							tourProb = (int)tourProb;
							if(tourProb < 90){
								TuesdayPW.print("yes yes ");
							}
							else if(tourProb >= 90 && tourProb < 95){
								TuesdayPW.print("yes no ");
							}
							else if(tourProb >= 95){
								TuesdayPW.print("no yes ");
							}
							
							TuesdayPW.print("null");
							TuesdayPW.println();
						}
					}
					TuesdayPW.close();
				}
				if(a==2){
					File Wednesday = new File("Wednesday" + "_" + "8" + "_" + "25" + ".txt");
					FileWriter Wednesdaywriter = new FileWriter(Wednesday, false);
					PrintWriter WednesdayPW = new PrintWriter(Wednesdaywriter);
					for(int b = 0; b < 5; b++){
						double WednesdaytourNum = generator.nextDouble();
						WednesdaytourNum = 5;
						WednesdaytourNum = (int)WednesdaytourNum;
						for(int c = 0; c < WednesdaytourNum; c++){
							WednesdayPW.print("Wednesday"+"_"+ b + "_" + c + " ");
							WednesdayPW.print("September 25 2013 ");
							if(b == 0){
								WednesdayPW.print("9:50 Break ");
							}
							else if(b==1){
								WednesdayPW.print("11:40 H ");
							}
							else if(b==2){
								WednesdayPW.print("1:00 Break ");
							}
							else if(b==3){
								WednesdayPW.print("2:30 Break ");
							}
							else if(b==4){
								WednesdayPW.print("4:00 Break ");
							}
							double Wednesdaycountry = generator.nextDouble();
							Wednesdaycountry = Wednesdaycountry*1152;
							Wednesdaycountry = (int)Wednesdaycountry;
							if(Wednesdaycountry < 900){
								WednesdayPW.print("0.0 ");
							}
							else if(Wednesdaycountry >= 900 && Wednesdaycountry < 907){
								WednesdayPW.print("1.0 ");
							}
							else if(Wednesdaycountry >= 907 && Wednesdaycountry < 914){
								WednesdayPW.print("2.0 ");
							}
							else if(Wednesdaycountry >= 914 && Wednesdaycountry < 921){
								WednesdayPW.print("3.0 ");
							}
							else if(Wednesdaycountry >= 921 && Wednesdaycountry < 928){
								WednesdayPW.print("4.0 ");
							}
							else if(Wednesdaycountry >= 928 && Wednesdaycountry < 935){
								WednesdayPW.print("5.0 ");
							}
							else if(Wednesdaycountry >= 935 && Wednesdaycountry < 942){
								WednesdayPW.print("6.0 ");
							}
							else if(Wednesdaycountry >= 942 && Wednesdaycountry < 949){
								WednesdayPW.print("7.0 ");
							}
							else if(Wednesdaycountry >= 949 && Wednesdaycountry < 956){
								WednesdayPW.print("8.0 ");
							}
							else if(Wednesdaycountry >= 956 && Wednesdaycountry < 963){
								WednesdayPW.print("9.0 ");
							}
							else if(Wednesdaycountry >= 963 && Wednesdaycountry < 970){
								WednesdayPW.print("10.0 ");
							}
							else if(Wednesdaycountry >= 970 && Wednesdaycountry < 977){
								WednesdayPW.print("11.0 ");
							}
							else if(Wednesdaycountry >= 977 && Wednesdaycountry < 984){
								WednesdayPW.print("12.0 ");
							}
							else if(Wednesdaycountry >= 984 && Wednesdaycountry < 991){
								WednesdayPW.print("13.0 ");
							}
							else if(Wednesdaycountry >= 991 && Wednesdaycountry < 998){
								WednesdayPW.print("14.0 ");
							}
							else if(Wednesdaycountry >= 998 && Wednesdaycountry < 1005){
								WednesdayPW.print("15.0 ");
							}
							else if(Wednesdaycountry >= 1005 && Wednesdaycountry < 1012){
								WednesdayPW.print("16.0 ");
							}
							else if(Wednesdaycountry >= 1012 && Wednesdaycountry < 1019){
								WednesdayPW.print("17.0 ");
							}
							else if(Wednesdaycountry >= 1019 && Wednesdaycountry < 1026){
								WednesdayPW.print("18.0 ");
							}
							else if(Wednesdaycountry >= 1026 && Wednesdaycountry < 1033){
								WednesdayPW.print("19.0 ");
							}
							else if(Wednesdaycountry >= 1033 && Wednesdaycountry < 1040){
								WednesdayPW.print("20.0 ");
							}
							else if(Wednesdaycountry >= 1040 && Wednesdaycountry < 1047){
								WednesdayPW.print("21.0 ");
							}
							else if(Wednesdaycountry >= 1047 && Wednesdaycountry < 1054){
								WednesdayPW.print("22.0 ");
							}
							else if(Wednesdaycountry >= 1054 && Wednesdaycountry < 1061){
								WednesdayPW.print("23.0 ");
							}
							else if(Wednesdaycountry >= 1061 && Wednesdaycountry < 1068){
								WednesdayPW.print("24.0 ");
							}
							else if(Wednesdaycountry >= 1068 && Wednesdaycountry < 1075){
								WednesdayPW.print("25.0 ");
							}
							else if(Wednesdaycountry >= 1075 && Wednesdaycountry < 1082){
								WednesdayPW.print("26.0 ");
							}
							else if(Wednesdaycountry >= 1082 && Wednesdaycountry < 1089){
								WednesdayPW.print("27.0 ");
							}
							else if(Wednesdaycountry >= 1089 && Wednesdaycountry < 1096){
								WednesdayPW.print("28.0 ");
							}
							else if(Wednesdaycountry >= 1096 && Wednesdaycountry < 1103){
								WednesdayPW.print("29.0 ");
							}
							else if(Wednesdaycountry >= 1103 && Wednesdaycountry < 1110){
								WednesdayPW.print("30.0 ");
							}
							else if(Wednesdaycountry >= 1110 && Wednesdaycountry < 1117){
								WednesdayPW.print("31.0 ");
							}
							else if(Wednesdaycountry >= 1117 && Wednesdaycountry < 1124){
								WednesdayPW.print("32.0 ");
							}
							else if(Wednesdaycountry >= 1124 && Wednesdaycountry < 1131){
								WednesdayPW.print("33.0 ");
							}
							else if(Wednesdaycountry >= 1131 && Wednesdaycountry < 1138){
								WednesdayPW.print("34.0 ");
							}
							else if(Wednesdaycountry >= 1138 && Wednesdaycountry < 1145){
								WednesdayPW.print("35.0 ");
							}
							else if(Wednesdaycountry >= 1145){
								WednesdayPW.print("36.0 ");
							}
							
							double gender = generator.nextDouble();
							gender = gender*2;
							gender = (int)gender;
							WednesdayPW.print(gender + " ");
							double GradeNum = generator.nextDouble();
							GradeNum = GradeNum*1000;
							GradeNum = (int)GradeNum;
							if(GradeNum < 500){
								WednesdayPW.print("9 ");
							}
							else if(GradeNum >= 500 && GradeNum < 800){
								WednesdayPW.print("10 ");
							}
							else if(GradeNum >= 800 && GradeNum < 900){
								WednesdayPW.print("11 ");
							}
							else if(GradeNum >= 900 && GradeNum < 950){
								WednesdayPW.print("12 ");
							}
							else if(GradeNum >= 950){
								WednesdayPW.print("PG ");
							}
							// Academic Interests: Math/Science, Humanities, Languages, Arts, All
							double academic = generator.nextDouble();
							academic = academic*100;
							academic = (int)academic;
							if(academic < 30){
								WednesdayPW.print("0.0 ");
							}
							else if(academic >= 30 && academic < 60){
								WednesdayPW.print("1.0 ");
							}
							else if(academic >= 60 && academic < 90){
								WednesdayPW.print("2.0 ");
							}
							else if(academic >= 90 && academic < 95){
								WednesdayPW.print("3.0 ");
							}
							else if(academic >= 95){
								WednesdayPW.print("4.0 ");
							}
							double fallProb = generator.nextDouble();
							fallProb = fallProb*2;
							fallProb = (int)fallProb;
							if(fallProb == 0){
								WednesdayPW.print("0.0 ");
								double WinterProb = generator.nextDouble();
								WinterProb = WinterProb*2;
								WinterProb = (int)WinterProb;
								if(WinterProb == 0){
									WednesdayPW.print("0.0 ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*2;
									SpringProb = (int)SpringProb;
									if(SpringProb == 0){
										WednesdayPW.print("0.0 ");
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
										WednesdayPW.print(springsport + " ");
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
									WednesdayPW.print(wintersport + " ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*4;
									SpringProb = (int)SpringProb;
									if(SpringProb < 3){
										WednesdayPW.print("0.0 ");
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
										WednesdayPW.print(springsport + " ");
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
								WednesdayPW.print(fallsport + " ");
								double WinterProb = generator.nextDouble();
								WinterProb = WinterProb*4;
								WinterProb = (int)WinterProb;
								if(WinterProb < 3){
									WednesdayPW.print("0.0 ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*4;
									SpringProb = (int)SpringProb;
									if(SpringProb < 3){
										WednesdayPW.print("0.0 ");
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
										WednesdayPW.print(springsport + " ");
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
									WednesdayPW.print(wintersport + " ");
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
										WednesdayPW.print(springsport + " ");
									}
									else if(SpringProb > 0){
										WednesdayPW.print("0.0 ");
									}
								}
							}
							//Clubs: Dance, Music, Math/Science, Debate/Public Speaking, Language, Culture
							double club1Prob = generator.nextDouble();
							club1Prob = club1Prob*5;
							club1Prob = (int)club1Prob;
							if(club1Prob == 0){
								WednesdayPW.print("0.0 0.0 ");
							}
							else if(club1Prob > 0){
								double club1 = generator.nextDouble();
								club1 = club1*7+1;
								club1 = (int)club1;
								WednesdayPW.print(club1 + " ");
								double club2Prob = generator.nextDouble();
								club2Prob = club2Prob*5;
								club2Prob = (int)club2Prob;
								if(club2Prob < 2){
									WednesdayPW.print("0.0 ");
								}
								else if(club2Prob >= 2){
									double club2 = generator.nextDouble();
									club2 = club2*7+1;
									club2 = (int)club2;
									if(club1 == club2){
										while(club1 == club2){
											club2 = generator.nextDouble();
											club2 = club2*7+1;
											club2 = (int)club2;
										}
									}
									WednesdayPW.print(club2 + " ");
								}
							}
							double boardingProb = generator.nextDouble();
							boardingProb = boardingProb*5;
							boardingProb = (int)boardingProb;
							if(boardingProb == 0){
								WednesdayPW.print("no ");
							}
							else if(boardingProb > 0){
								WednesdayPW.print("yes ");
							}
							double tourProb = generator.nextDouble();
							tourProb = tourProb*100;
							tourProb = (int)tourProb;
							if(tourProb < 90){
								WednesdayPW.print("yes yes ");
							}
							else if(tourProb >= 90 && tourProb < 95){
								WednesdayPW.print("yes no ");
							}
							else if(tourProb >= 95){
								WednesdayPW.print("no yes ");
							}
							
							WednesdayPW.print("null");
							WednesdayPW.println();
						}
					}
					WednesdayPW.close();
				}
				if(a==3){
					File Thursday = new File("Thursday" + "_" + "8" + "_" + "26" + ".txt");
					FileWriter Thursdaywriter = new FileWriter(Thursday, false);
					PrintWriter ThursdayPW = new PrintWriter(Thursdaywriter);
					for(int b = 0; b < 5; b++){
						double ThursdaytourNum = generator.nextDouble();
						ThursdaytourNum = 5;
						ThursdaytourNum = (int)ThursdaytourNum;
						for(int c = 0; c < ThursdaytourNum; c++){
							ThursdayPW.print("Thursday"+"_"+ b + "_" + c + " ");
							ThursdayPW.print("September 26 2013 ");
							if(b == 0){
								ThursdayPW.print("8:00 W ");
							}
							else if(b==1){
								ThursdayPW.print("9:50 Break ");
							}
							else if(b==2){
								ThursdayPW.print("11:40 A ");
							}
							else if(b==3){
								ThursdayPW.print("2:35 Y ");
							}
							else if(b==4){
								ThursdayPW.print("3:55 G ");
							}
							double Thursdaycountry = generator.nextDouble();
							Thursdaycountry = Thursdaycountry*1152;
							Thursdaycountry = (int)Thursdaycountry;
							if(Thursdaycountry < 900){
								ThursdayPW.print("0.0 ");
							}
							else if(Thursdaycountry >= 900 && Thursdaycountry < 907){
								ThursdayPW.print("1.0 ");
							}
							else if(Thursdaycountry >= 907 && Thursdaycountry < 914){
								ThursdayPW.print("2.0 ");
							}
							else if(Thursdaycountry >= 914 && Thursdaycountry < 921){
								ThursdayPW.print("3.0 ");
							}
							else if(Thursdaycountry >= 921 && Thursdaycountry < 928){
								ThursdayPW.print("4.0 ");
							}
							else if(Thursdaycountry >= 928 && Thursdaycountry < 935){
								ThursdayPW.print("5.0 ");
							}
							else if(Thursdaycountry >= 935 && Thursdaycountry < 942){
								ThursdayPW.print("6.0 ");
							}
							else if(Thursdaycountry >= 942 && Thursdaycountry < 949){
								ThursdayPW.print("7.0 ");
							}
							else if(Thursdaycountry >= 949 && Thursdaycountry < 956){
								ThursdayPW.print("8.0 ");
							}
							else if(Thursdaycountry >= 956 && Thursdaycountry < 963){
								ThursdayPW.print("9.0 ");
							}
							else if(Thursdaycountry >= 963 && Thursdaycountry < 970){
								ThursdayPW.print("10.0 ");
							}
							else if(Thursdaycountry >= 970 && Thursdaycountry < 977){
								ThursdayPW.print("11.0 ");
							}
							else if(Thursdaycountry >= 977 && Thursdaycountry < 984){
								ThursdayPW.print("12.0 ");
							}
							else if(Thursdaycountry >= 984 && Thursdaycountry < 991){
								ThursdayPW.print("13.0 ");
							}
							else if(Thursdaycountry >= 991 && Thursdaycountry < 998){
								ThursdayPW.print("14.0 ");
							}
							else if(Thursdaycountry >= 998 && Thursdaycountry < 1005){
								ThursdayPW.print("15.0 ");
							}
							else if(Thursdaycountry >= 1005 && Thursdaycountry < 1012){
								ThursdayPW.print("16.0 ");
							}
							else if(Thursdaycountry >= 1012 && Thursdaycountry < 1019){
								ThursdayPW.print("17.0 ");
							}
							else if(Thursdaycountry >= 1019 && Thursdaycountry < 1026){
								ThursdayPW.print("18.0 ");
							}
							else if(Thursdaycountry >= 1026 && Thursdaycountry < 1033){
								ThursdayPW.print("19.0 ");
							}
							else if(Thursdaycountry >= 1033 && Thursdaycountry < 1040){
								ThursdayPW.print("20.0 ");
							}
							else if(Thursdaycountry >= 1040 && Thursdaycountry < 1047){
								ThursdayPW.print("21.0 ");
							}
							else if(Thursdaycountry >= 1047 && Thursdaycountry < 1054){
								ThursdayPW.print("22.0 ");
							}
							else if(Thursdaycountry >= 1054 && Thursdaycountry < 1061){
								ThursdayPW.print("23.0 ");
							}
							else if(Thursdaycountry >= 1061 && Thursdaycountry < 1068){
								ThursdayPW.print("24.0 ");
							}
							else if(Thursdaycountry >= 1068 && Thursdaycountry < 1075){
								ThursdayPW.print("25.0 ");
							}
							else if(Thursdaycountry >= 1075 && Thursdaycountry < 1082){
								ThursdayPW.print("26.0 ");
							}
							else if(Thursdaycountry >= 1082 && Thursdaycountry < 1089){
								ThursdayPW.print("27.0 ");
							}
							else if(Thursdaycountry >= 1089 && Thursdaycountry < 1096){
								ThursdayPW.print("28.0 ");
							}
							else if(Thursdaycountry >= 1096 && Thursdaycountry < 1103){
								ThursdayPW.print("29.0 ");
							}
							else if(Thursdaycountry >= 1103 && Thursdaycountry < 1110){
								ThursdayPW.print("30.0 ");
							}
							else if(Thursdaycountry >= 1110 && Thursdaycountry < 1117){
								ThursdayPW.print("31.0 ");
							}
							else if(Thursdaycountry >= 1117 && Thursdaycountry < 1124){
								ThursdayPW.print("32.0 ");
							}
							else if(Thursdaycountry >= 1124 && Thursdaycountry < 1131){
								ThursdayPW.print("33.0 ");
							}
							else if(Thursdaycountry >= 1131 && Thursdaycountry < 1138){
								ThursdayPW.print("34.0 ");
							}
							else if(Thursdaycountry >= 1138 && Thursdaycountry < 1145){
								ThursdayPW.print("35.0 ");
							}
							else if(Thursdaycountry >= 1145){
								ThursdayPW.print("36.0 ");
							}
							
							double gender = generator.nextDouble();
							gender = gender*2;
							gender = (int)gender;
							ThursdayPW.print(gender + " ");
							double GradeNum = generator.nextDouble();
							GradeNum = GradeNum*1000;
							GradeNum = (int)GradeNum;
							if(GradeNum < 500){
								ThursdayPW.print("9 ");
							}
							else if(GradeNum >= 500 && GradeNum < 800){
								ThursdayPW.print("10 ");
							}
							else if(GradeNum >= 800 && GradeNum < 900){
								ThursdayPW.print("11 ");
							}
							else if(GradeNum >= 900 && GradeNum < 950){
								ThursdayPW.print("12 ");
							}
							else if(GradeNum >= 950){
								ThursdayPW.print("PG ");
							}
							// Academic Interests: Math/Science, Humanities, Languages, Arts, All
							double academic = generator.nextDouble();
							academic = academic*100;
							academic = (int)academic;
							if(academic < 30){
								ThursdayPW.print("0.0 ");
							}
							else if(academic >= 30 && academic < 60){
								ThursdayPW.print("1.0 ");
							}
							else if(academic >= 60 && academic < 90){
								ThursdayPW.print("2.0 ");
							}
							else if(academic >= 90 && academic < 95){
								ThursdayPW.print("3.0 ");
							}
							else if(academic >= 95){
								ThursdayPW.print("4.0 ");
							}
							double fallProb = generator.nextDouble();
							fallProb = fallProb*2;
							fallProb = (int)fallProb;
							if(fallProb == 0){
								ThursdayPW.print("0.0 ");
								double WinterProb = generator.nextDouble();
								WinterProb = WinterProb*2;
								WinterProb = (int)WinterProb;
								if(WinterProb == 0){
									ThursdayPW.print("0.0 ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*2;
									SpringProb = (int)SpringProb;
									if(SpringProb == 0){
										ThursdayPW.print("0.0 ");
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
										ThursdayPW.print(springsport + " ");
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
									ThursdayPW.print(wintersport + " ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*4;
									SpringProb = (int)SpringProb;
									if(SpringProb < 3){
										ThursdayPW.print("0.0 ");
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
										ThursdayPW.print(springsport + " ");
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
								ThursdayPW.print(fallsport + " ");
								double WinterProb = generator.nextDouble();
								WinterProb = WinterProb*4;
								WinterProb = (int)WinterProb;
								if(WinterProb < 3){
									ThursdayPW.print("0.0 ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*4;
									SpringProb = (int)SpringProb;
									if(SpringProb < 3){
										ThursdayPW.print("0.0 ");
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
										ThursdayPW.print(springsport + " ");
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
									ThursdayPW.print(wintersport + " ");
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
										ThursdayPW.print(springsport + " ");
									}
									else if(SpringProb > 0){
										ThursdayPW.print("0.0 ");
									}
								}
							}
							//Clubs: Dance, Music, Math/Science, Debate/Public Speaking, Language, Culture
							double club1Prob = generator.nextDouble();
							club1Prob = club1Prob*5;
							club1Prob = (int)club1Prob;
							if(club1Prob == 0){
								ThursdayPW.print("0.0 0.0 ");
							}
							else if(club1Prob > 0){
								double club1 = generator.nextDouble();
								club1 = club1*7+1;
								club1 = (int)club1;
								ThursdayPW.print(club1 + " ");
								double club2Prob = generator.nextDouble();
								club2Prob = club2Prob*5;
								club2Prob = (int)club2Prob;
								if(club2Prob < 2){
									ThursdayPW.print("0.0 ");
								}
								else if(club2Prob >= 2){
									double club2 = generator.nextDouble();
									club2 = club2*7+1;
									club2 = (int)club2;
									if(club1 == club2){
										while(club1 == club2){
											club2 = generator.nextDouble();
											club2 = club2*7+1;
											club2 = (int)club2;
										}
									}
									ThursdayPW.print(club2 + " ");
								}
							}
							double boardingProb = generator.nextDouble();
							boardingProb = boardingProb*5;
							boardingProb = (int)boardingProb;
							if(boardingProb == 0){
								ThursdayPW.print("no ");
							}
							else if(boardingProb > 0){
								ThursdayPW.print("yes ");
							}
							double tourProb = generator.nextDouble();
							tourProb = tourProb*100;
							tourProb = (int)tourProb;
							if(tourProb < 90){
								ThursdayPW.print("yes yes ");
							}
							else if(tourProb >= 90 && tourProb < 95){
								ThursdayPW.print("yes no ");
							}
							else if(tourProb >= 95){
								ThursdayPW.print("no yes ");
							}
							
							ThursdayPW.print("null");
							ThursdayPW.println();
						}
					}
					ThursdayPW.close();
				}
				if(a==4){
					File Friday = new File("Friday" + "_" + "8" + "_" + "27" + ".txt");
					FileWriter Fridaywriter = new FileWriter(Friday, false);
					PrintWriter FridayPW = new PrintWriter(Fridaywriter);
					for(int b = 0; b < 5; b++){
						double FridaytourNum = generator.nextDouble();
						FridaytourNum = 5;
						FridaytourNum = (int)FridaytourNum;
						for(int c = 0; c < FridaytourNum; c++){
							FridayPW.print("Friday"+"_"+ b + "_" + c + " ");
							FridayPW.print("September 27 2013 ");
							if(b == 0){
								FridayPW.print("8:00 V ");
							}
							else if(b==1){
								FridayPW.print("10:00 Break ");
							}
							else if(b==2){
								FridayPW.print("10:45 A ");
							}
							else if(b==3){
								FridayPW.print("11:45 B ");
							}
							else if(b==4){
								FridayPW.print("1:40 X ");
							}
							double Fridaycountry = generator.nextDouble();
							Fridaycountry = Fridaycountry*1152;
							Fridaycountry = (int)Fridaycountry;
							if(Fridaycountry < 900){
								FridayPW.print("0.0 ");
							}
							else if(Fridaycountry >= 900 && Fridaycountry < 907){
								FridayPW.print("1.0 ");
							}
							else if(Fridaycountry >= 907 && Fridaycountry < 914){
								FridayPW.print("2.0 ");
							}
							else if(Fridaycountry >= 914 && Fridaycountry < 921){
								FridayPW.print("3.0 ");
							}
							else if(Fridaycountry >= 921 && Fridaycountry < 928){
								FridayPW.print("4.0 ");
							}
							else if(Fridaycountry >= 928 && Fridaycountry < 935){
								FridayPW.print("5.0 ");
							}
							else if(Fridaycountry >= 935 && Fridaycountry < 942){
								FridayPW.print("6.0 ");
							}
							else if(Fridaycountry >= 942 && Fridaycountry < 949){
								FridayPW.print("7.0 ");
							}
							else if(Fridaycountry >= 949 && Fridaycountry < 956){
								FridayPW.print("8.0 ");
							}
							else if(Fridaycountry >= 956 && Fridaycountry < 963){
								FridayPW.print("9.0 ");
							}
							else if(Fridaycountry >= 963 && Fridaycountry < 970){
								FridayPW.print("10.0 ");
							}
							else if(Fridaycountry >= 970 && Fridaycountry < 977){
								FridayPW.print("11.0 ");
							}
							else if(Fridaycountry >= 977 && Fridaycountry < 984){
								FridayPW.print("12.0 ");
							}
							else if(Fridaycountry >= 984 && Fridaycountry < 991){
								FridayPW.print("13.0 ");
							}
							else if(Fridaycountry >= 991 && Fridaycountry < 998){
								FridayPW.print("14.0 ");
							}
							else if(Fridaycountry >= 998 && Fridaycountry < 1005){
								FridayPW.print("15.0 ");
							}
							else if(Fridaycountry >= 1005 && Fridaycountry < 1012){
								FridayPW.print("16.0 ");
							}
							else if(Fridaycountry >= 1012 && Fridaycountry < 1019){
								FridayPW.print("17.0 ");
							}
							else if(Fridaycountry >= 1019 && Fridaycountry < 1026){
								FridayPW.print("18.0 ");
							}
							else if(Fridaycountry >= 1026 && Fridaycountry < 1033){
								FridayPW.print("19.0 ");
							}
							else if(Fridaycountry >= 1033 && Fridaycountry < 1040){
								FridayPW.print("20.0 ");
							}
							else if(Fridaycountry >= 1040 && Fridaycountry < 1047){
								FridayPW.print("21.0 ");
							}
							else if(Fridaycountry >= 1047 && Fridaycountry < 1054){
								FridayPW.print("22.0 ");
							}
							else if(Fridaycountry >= 1054 && Fridaycountry < 1061){
								FridayPW.print("23.0 ");
							}
							else if(Fridaycountry >= 1061 && Fridaycountry < 1068){
								FridayPW.print("24.0 ");
							}
							else if(Fridaycountry >= 1068 && Fridaycountry < 1075){
								FridayPW.print("25.0 ");
							}
							else if(Fridaycountry >= 1075 && Fridaycountry < 1082){
								FridayPW.print("26.0 ");
							}
							else if(Fridaycountry >= 1082 && Fridaycountry < 1089){
								FridayPW.print("27.0 ");
							}
							else if(Fridaycountry >= 1089 && Fridaycountry < 1096){
								FridayPW.print("28.0 ");
							}
							else if(Fridaycountry >= 1096 && Fridaycountry < 1103){
								FridayPW.print("29.0 ");
							}
							else if(Fridaycountry >= 1103 && Fridaycountry < 1110){
								FridayPW.print("30.0 ");
							}
							else if(Fridaycountry >= 1110 && Fridaycountry < 1117){
								FridayPW.print("31.0 ");
							}
							else if(Fridaycountry >= 1117 && Fridaycountry < 1124){
								FridayPW.print("32.0 ");
							}
							else if(Fridaycountry >= 1124 && Fridaycountry < 1131){
								FridayPW.print("33.0 ");
							}
							else if(Fridaycountry >= 1131 && Fridaycountry < 1138){
								FridayPW.print("34.0 ");
							}
							else if(Fridaycountry >= 1138 && Fridaycountry < 1145){
								FridayPW.print("35.0 ");
							}
							else if(Fridaycountry >= 1145){
								FridayPW.print("36.0 ");
							}
							
							double gender = generator.nextDouble();
							gender = gender*2;
							gender = (int)gender;
							FridayPW.print(gender + " ");
							double GradeNum = generator.nextDouble();
							GradeNum = GradeNum*1000;
							GradeNum = (int)GradeNum;
							if(GradeNum < 500){
								FridayPW.print("9 ");
							}
							else if(GradeNum >= 500 && GradeNum < 800){
								FridayPW.print("10 ");
							}
							else if(GradeNum >= 800 && GradeNum < 900){
								FridayPW.print("11 ");
							}
							else if(GradeNum >= 900 && GradeNum < 950){
								FridayPW.print("12 ");
							}
							else if(GradeNum >= 950){
								FridayPW.print("PG ");
							}
							// Academic Interests: Math/Science, Humanities, Languages, Arts, All
							double academic = generator.nextDouble();
							academic = academic*100;
							academic = (int)academic;
							if(academic < 30){
								FridayPW.print("0.0 ");
							}
							else if(academic >= 30 && academic < 60){
								FridayPW.print("1.0 ");
							}
							else if(academic >= 60 && academic < 90){
								FridayPW.print("2.0 ");
							}
							else if(academic >= 90 && academic < 95){
								FridayPW.print("3.0 ");
							}
							else if(academic >= 95){
								FridayPW.print("4.0 ");
							}
							double fallProb = generator.nextDouble();
							fallProb = fallProb*2;
							fallProb = (int)fallProb;
							if(fallProb == 0){
								FridayPW.print("0.0 ");
								double WinterProb = generator.nextDouble();
								WinterProb = WinterProb*2;
								WinterProb = (int)WinterProb;
								if(WinterProb == 0){
									FridayPW.print("0.0 ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*2;
									SpringProb = (int)SpringProb;
									if(SpringProb == 0){
										FridayPW.print("0.0 ");
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
										FridayPW.print(springsport + " ");
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
									FridayPW.print(wintersport + " ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*4;
									SpringProb = (int)SpringProb;
									if(SpringProb < 3){
										FridayPW.print("0.0 ");
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
										FridayPW.print(springsport + " ");
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
								FridayPW.print(fallsport + " ");
								double WinterProb = generator.nextDouble();
								WinterProb = WinterProb*4;
								WinterProb = (int)WinterProb;
								if(WinterProb < 3){
									FridayPW.print("0.0 ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*4;
									SpringProb = (int)SpringProb;
									if(SpringProb < 3){
										FridayPW.print("0.0 ");
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
										FridayPW.print(springsport + " ");
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
									FridayPW.print(wintersport + " ");
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
										FridayPW.print(springsport + " ");
									}
									else if(SpringProb > 0){
										FridayPW.print("0.0 ");
									}
								}
							}
							//Clubs: Dance, Music, Math/Science, Debate/Public Speaking, Language, Culture
							double club1Prob = generator.nextDouble();
							club1Prob = club1Prob*5;
							club1Prob = (int)club1Prob;
							if(club1Prob == 0){
								FridayPW.print("0.0 0.0 ");
							}
							else if(club1Prob > 0){
								double club1 = generator.nextDouble();
								club1 = club1*7+1;
								club1 = (int)club1;
								FridayPW.print(club1 + " ");
								double club2Prob = generator.nextDouble();
								club2Prob = club2Prob*5;
								club2Prob = (int)club2Prob;
								if(club2Prob < 2){
									FridayPW.print("0.0 ");
								}
								else if(club2Prob >= 2){
									double club2 = generator.nextDouble();
									club2 = club2*7+1;
									club2 = (int)club2;
									if(club1 == club2){
										while(club1 == club2){
											club2 = generator.nextDouble();
											club2 = club2*7+1;
											club2 = (int)club2;
										}
									}
									FridayPW.print(club2 + " ");
								}
							}
							double boardingProb = generator.nextDouble();
							boardingProb = boardingProb*5;
							boardingProb = (int)boardingProb;
							if(boardingProb == 0){
								FridayPW.print("no ");
							}
							else if(boardingProb > 0){
								FridayPW.print("yes ");
							}
							double tourProb = generator.nextDouble();
							tourProb = tourProb*100;
							tourProb = (int)tourProb;
							if(tourProb < 90){
								FridayPW.print("yes yes ");
							}
							else if(tourProb >= 90 && tourProb < 95){
								FridayPW.print("yes no ");
							}
							else if(tourProb >= 95){
								FridayPW.print("no yes ");
							}
							
							FridayPW.print("null");
							FridayPW.println();
						}
					}
					FridayPW.close();
				}
				if(a==5){
					File Saturday = new File("Saturday" + "_" + "8" + "_" + "28" + ".txt");
					FileWriter Saturdaywriter = new FileWriter(Saturday, false);
					PrintWriter SaturdayPW = new PrintWriter(Saturdaywriter);
					for(int b = 0; b < 4; b++){
						double SaturdaytourNum = generator.nextDouble();
						SaturdaytourNum = 5;
						SaturdaytourNum = (int)SaturdaytourNum;
						for(int c = 0; c < SaturdaytourNum; c++){
							SaturdayPW.print("Saturday"+"_"+ b + "_" + c + " ");
							SaturdayPW.print("September 28 2013 ");
							if(b == 0){
								SaturdayPW.print("8:30 Break ");
							}
							else if(b==1){
								SaturdayPW.print("9:30 Break ");
							}
							else if(b==2){
								SaturdayPW.print("10:30 Break ");
							}
							else if(b==3){
								SaturdayPW.print("11:30 Break ");
							}
							double Saturdaycountry = generator.nextDouble();
							Saturdaycountry = Saturdaycountry*1152;
							Saturdaycountry = (int)Saturdaycountry;
							if(Saturdaycountry < 900){
								SaturdayPW.print("0.0 ");
							}
							else if(Saturdaycountry >= 900 && Saturdaycountry < 907){
								SaturdayPW.print("1.0 ");
							}
							else if(Saturdaycountry >= 907 && Saturdaycountry < 914){
								SaturdayPW.print("2.0 ");
							}
							else if(Saturdaycountry >= 914 && Saturdaycountry < 921){
								SaturdayPW.print("3.0 ");
							}
							else if(Saturdaycountry >= 921 && Saturdaycountry < 928){
								SaturdayPW.print("4.0 ");
							}
							else if(Saturdaycountry >= 928 && Saturdaycountry < 935){
								SaturdayPW.print("5.0 ");
							}
							else if(Saturdaycountry >= 935 && Saturdaycountry < 942){
								SaturdayPW.print("6.0 ");
							}
							else if(Saturdaycountry >= 942 && Saturdaycountry < 949){
								SaturdayPW.print("7.0 ");
							}
							else if(Saturdaycountry >= 949 && Saturdaycountry < 956){
								SaturdayPW.print("8.0 ");
							}
							else if(Saturdaycountry >= 956 && Saturdaycountry < 963){
								SaturdayPW.print("9.0 ");
							}
							else if(Saturdaycountry >= 963 && Saturdaycountry < 970){
								SaturdayPW.print("10.0 ");
							}
							else if(Saturdaycountry >= 970 && Saturdaycountry < 977){
								SaturdayPW.print("11.0 ");
							}
							else if(Saturdaycountry >= 977 && Saturdaycountry < 984){
								SaturdayPW.print("12.0 ");
							}
							else if(Saturdaycountry >= 984 && Saturdaycountry < 991){
								SaturdayPW.print("13.0 ");
							}
							else if(Saturdaycountry >= 991 && Saturdaycountry < 998){
								SaturdayPW.print("14.0 ");
							}
							else if(Saturdaycountry >= 998 && Saturdaycountry < 1005){
								SaturdayPW.print("15.0 ");
							}
							else if(Saturdaycountry >= 1005 && Saturdaycountry < 1012){
								SaturdayPW.print("16.0 ");
							}
							else if(Saturdaycountry >= 1012 && Saturdaycountry < 1019){
								SaturdayPW.print("17.0 ");
							}
							else if(Saturdaycountry >= 1019 && Saturdaycountry < 1026){
								SaturdayPW.print("18.0 ");
							}
							else if(Saturdaycountry >= 1026 && Saturdaycountry < 1033){
								SaturdayPW.print("19.0 ");
							}
							else if(Saturdaycountry >= 1033 && Saturdaycountry < 1040){
								SaturdayPW.print("20.0 ");
							}
							else if(Saturdaycountry >= 1040 && Saturdaycountry < 1047){
								SaturdayPW.print("21.0 ");
							}
							else if(Saturdaycountry >= 1047 && Saturdaycountry < 1054){
								SaturdayPW.print("22.0 ");
							}
							else if(Saturdaycountry >= 1054 && Saturdaycountry < 1061){
								SaturdayPW.print("23.0 ");
							}
							else if(Saturdaycountry >= 1061 && Saturdaycountry < 1068){
								SaturdayPW.print("24.0 ");
							}
							else if(Saturdaycountry >= 1068 && Saturdaycountry < 1075){
								SaturdayPW.print("25.0 ");
							}
							else if(Saturdaycountry >= 1075 && Saturdaycountry < 1082){
								SaturdayPW.print("26.0 ");
							}
							else if(Saturdaycountry >= 1082 && Saturdaycountry < 1089){
								SaturdayPW.print("27.0 ");
							}
							else if(Saturdaycountry >= 1089 && Saturdaycountry < 1096){
								SaturdayPW.print("28.0 ");
							}
							else if(Saturdaycountry >= 1096 && Saturdaycountry < 1103){
								SaturdayPW.print("29.0 ");
							}
							else if(Saturdaycountry >= 1103 && Saturdaycountry < 1110){
								SaturdayPW.print("30.0 ");
							}
							else if(Saturdaycountry >= 1110 && Saturdaycountry < 1117){
								SaturdayPW.print("31.0 ");
							}
							else if(Saturdaycountry >= 1117 && Saturdaycountry < 1124){
								SaturdayPW.print("32.0 ");
							}
							else if(Saturdaycountry >= 1124 && Saturdaycountry < 1131){
								SaturdayPW.print("33.0 ");
							}
							else if(Saturdaycountry >= 1131 && Saturdaycountry < 1138){
								SaturdayPW.print("34.0 ");
							}
							else if(Saturdaycountry >= 1138 && Saturdaycountry < 1145){
								SaturdayPW.print("35.0 ");
							}
							else if(Saturdaycountry >= 1145){
								SaturdayPW.print("36.0 ");
							}
							
							double gender = generator.nextDouble();
							gender = gender*2;
							gender = (int)gender;
							SaturdayPW.print(gender + " ");
							double GradeNum = generator.nextDouble();
							GradeNum = GradeNum*1000;
							GradeNum = (int)GradeNum;
							if(GradeNum < 500){
								SaturdayPW.print("9 ");
							}
							else if(GradeNum >= 500 && GradeNum < 800){
								SaturdayPW.print("10 ");
							}
							else if(GradeNum >= 800 && GradeNum < 900){
								SaturdayPW.print("11 ");
							}
							else if(GradeNum >= 900 && GradeNum < 950){
								SaturdayPW.print("12 ");
							}
							else if(GradeNum >= 950){
								SaturdayPW.print("PG ");
							}
							// Academic Interests: Math/Science, Humanities, Languages, Arts, All
							double academic = generator.nextDouble();
							academic = academic*100;
							academic = (int)academic;
							if(academic < 30){
								SaturdayPW.print("0.0 ");
							}
							else if(academic >= 30 && academic < 60){
								SaturdayPW.print("1.0 ");
							}
							else if(academic >= 60 && academic < 90){
								SaturdayPW.print("2.0 ");
							}
							else if(academic >= 90 && academic < 95){
								SaturdayPW.print("3.0 ");
							}
							else if(academic >= 95){
								SaturdayPW.print("4.0 ");
							}
							double fallProb = generator.nextDouble();
							fallProb = fallProb*2;
							fallProb = (int)fallProb;
							if(fallProb == 0){
								SaturdayPW.print("0.0 ");
								double WinterProb = generator.nextDouble();
								WinterProb = WinterProb*2;
								WinterProb = (int)WinterProb;
								if(WinterProb == 0){
									SaturdayPW.print("0.0 ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*2;
									SpringProb = (int)SpringProb;
									if(SpringProb == 0){
										SaturdayPW.print("0.0 ");
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
										SaturdayPW.print(springsport + " ");
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
									SaturdayPW.print(wintersport + " ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*4;
									SpringProb = (int)SpringProb;
									if(SpringProb < 3){
										SaturdayPW.print("0.0 ");
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
										SaturdayPW.print(springsport + " ");
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
								SaturdayPW.print(fallsport + " ");
								double WinterProb = generator.nextDouble();
								WinterProb = WinterProb*4;
								WinterProb = (int)WinterProb;
								if(WinterProb < 3){
									SaturdayPW.print("0.0 ");
									double SpringProb = generator.nextDouble();
									SpringProb = SpringProb*4;
									SpringProb = (int)SpringProb;
									if(SpringProb < 3){
										SaturdayPW.print("0.0 ");
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
										SaturdayPW.print(springsport + " ");
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
									SaturdayPW.print(wintersport + " ");
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
										SaturdayPW.print(springsport + " ");
									}
									else if(SpringProb > 0){
										SaturdayPW.print("0.0 ");
									}
								}
							}
							//Clubs: Dance, Music, Math/Science, Debate/Public Speaking, Language, Culture
							double club1Prob = generator.nextDouble();
							club1Prob = club1Prob*5;
							club1Prob = (int)club1Prob;
							if(club1Prob == 0){
								SaturdayPW.print("0.0 0.0 ");
							}
							else if(club1Prob > 0){
								double club1 = generator.nextDouble();
								club1 = club1*7+1;
								club1 = (int)club1;
								SaturdayPW.print(club1 + " ");
								double club2Prob = generator.nextDouble();
								club2Prob = club2Prob*5;
								club2Prob = (int)club2Prob;
								if(club2Prob < 2){
									SaturdayPW.print("0.0 ");
								}
								else if(club2Prob >= 2){
									double club2 = generator.nextDouble();
									club2 = club2*7+1;
									club2 = (int)club2;
									if(club1 == club2){
										while(club1 == club2){
											club2 = generator.nextDouble();
											club2 = club2*7+1;
											club2 = (int)club2;
										}
									}
									SaturdayPW.print(club2 + " ");
								}
							}
							double boardingProb = generator.nextDouble();
							boardingProb = boardingProb*5;
							boardingProb = (int)boardingProb;
							if(boardingProb == 0){
								SaturdayPW.print("no ");
							}
							else if(boardingProb > 0){
								SaturdayPW.print("yes ");
							}
							double tourProb = generator.nextDouble();
							tourProb = tourProb*100;
							tourProb = (int)tourProb;
							if(tourProb < 90){
								SaturdayPW.print("yes yes ");
							}
							else if(tourProb >= 90 && tourProb < 95){
								SaturdayPW.print("yes no ");
							}
							else if(tourProb >= 95){
								SaturdayPW.print("no yes ");
							}
							
							SaturdayPW.print("null");
							SaturdayPW.println();
						}
					}
					SaturdayPW.close();
				}
			}
		}
	  catch (IOException u) {
		return;
	}
		
	}
}
