import java.util.Scanner;

import NesneYonelımlıProgrsmlama.FinalSınıf2;

public class ProgramlamaFinal {

	public static void main(String[] args) {
		
		Scanner atama = new Scanner(System.in);
	          
		FinalSınıf2 kullanıcı0=new FinalSınıf2();
		
		
                   System.out.println("FİLİSTİN'E DESTEK SİTEMİNE HOSGELDİNİZ");
                  System.out.println("Kimlik bilgilerinizi giriniz");
                  
                	  
                	  System.out.println("İsminizi ve soyisminizi giriniz =");
               kullanıcı0.ısımBılgısı=atama.nextLine();
               
               System.out.println("Tc kimlik numaranızı giriniz");
               Scanner s = new Scanner(System.in);
               String tc;
               while (!(tc = s.nextLine()).matches("^[1-9]\\d{10}$")) 
                   System.out.print("Hatalı! TC No (11 hane): ");
               System.out.println("Geçerli TC: " + tc);
            
                 System.out.println("telefon numaranızı giriniz");
                 kullanıcı0.telno=atama.nextLine();
                        System.out.println("Yapmak istediğiniz yardım yöntemini seçiniz");
                        
                         System.out.println("1 == Maddi tl yardımı");
                        
                          System.out.println("2 == Maddi malzeme yardımı");
                        
                            System.out.println("3 == Gönüllülük yardımı(Zanaat , sanat ve egitim harici) ");
                              
                             
                              
                             kullanıcı0.a=atama.nextInt();
                      		switch(kullanıcı0.a) {
                    		case 1:
                    			    System.out.println("Yardımda bulunmak istediğiniz para miktarını giriniz ");
                       			     
                    		           	kullanıcı0.miktar=atama.nextInt();
                    		           	
                    			System.out.println("yardımda bulundugunuz miktar "+kullanıcı0.miktar+" teşşekkür ederiz");
                    		     	break;
                    		case 2:  
                    			System.out.println("yapmak istediğiniz malzemeleri listeleyiniz");
                    			
                    		 	 System.out.println("1== Giyecekler");
                    			
                    			   System.out.println("2== Gıda");
                    			
                    			 System.out.println("3== Kırtasiye ürünleri");
                    			 
                    			 atama.nextLine();
                    			
                    			kullanıcı0.giyecek=atama.nextLine();
                    			
                    			   kullanıcı0.gıda=atama.nextLine();
                    			
                    			  kullanıcı0.kırtasiye=atama.nextLine();
                    			
                    		         	System.out.println("|||||Yaptığınız yardım listesi şu şekilde|||||");
                    			
                    		      	System.out.println(kullanıcı0.giyecek);
                    			   
                    			
                    			  System.out.println(kullanıcı0.gıda);
                    			
                    			System.out.println(kullanıcı0.kırtasiye);
                    			
                    			System.out.println("|||||YAPTIĞINIZ YARDIMLARDAN DOLAYI TEŞEKKÜR EDERİZ|||||");
                    			break;
                    		case 3:
                    			
                    		
                    			 
                    			         System.out.println("Gönüllük kapsamında yapabileceginiz iş alanını yazınız");
                    			kullanıcı0.alan=atama.nextLine();
                    			
                    			
                    			
                    			             System.out.println("Çalışabileceğiniz maksimum süreyi giriniz");
                    			kullanıcı0.zaman=atama.nextLine();
                    			
                    			     System.out.println("gönüllülük kapsamında TÜRKİYEDE Mİ yoksa FİLİSTİN DE mi hizmet etmek istersiniz");
                    			kullanıcı0.yer=atama.nextLine();
                    			   System.out.println(kullanıcı0.yer+" de ki yetkililerimiz sizinle iletişime geçecektir"+kullanıcı0.zaman+" lık gönüllülük sürecinizi gönülden "
                    			   		+ "kutlar başarılar dileriz");
                    		
                    			default:
                    			System.out.println("Hatalı bir işlem yaptınız lütfen tekrar deneyiniz ");
                    		}
                      	
		}

		
	}


