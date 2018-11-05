import java.util.Scanner;

class bigproject
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);

		double harga, jam, total, durasi, durasi2;
		String lapangan, hari, posisi, pemesan, letaknya;
		int b, k;

		String[][] letaklapangan = new String[4][3];

		System.out.println("");
		System.out.println("\t\t|============================================================|");
		System.out.println("\t\t=============+ #JASA PEMESANAN LAPANGAN FUTSAL# +=============");
		System.out.println("\t\t|============================================================|");
		System.out.println("\t\t|                      ~ALADZIFI FUTSAL~                     |");
		System.out.println("\t\t|============================================================|");

		//System.out.println("");
		//System.out.println("\t|============================================================|");
		//System.out.println("\t=============+ #JASA PEMESANAN LAPANGAN FUTSAL# +=============");
		//System.out.println("\t|============================================================|");
		//System.out.println("\t|                     ~ALADZIEVIE FUTSAL~                    |");
		//System.out.println("\t==============================================================");


		System.out.print("\n============================================================");
		System.out.print("\n\tSELAMAT DATANG DI ALADZIEVIE FUTSAL ");
		System.out.print("\n1. Buka setiap hari senin sampai sabtu");
		System.out.print("\n2. PAGI (07.00 - 11.00)");
		System.out.print("\n3. SIANG(12.00 - 17.00)");
		System.out.print("\n4. MALAM(18.00 - 23.00)");
		System.out.print("\n============================================================");
		System.out.print("\n");


		System.out.println("");
		System.out.println("============================================================");
		System.out.print("Masukkan nama pemesan : ");
		pemesan = sc.nextLine();

		do
		{
			System.out.print("Pilih hari pemesanan :");
			hari = sc.nextLine();

			if(hari.equalsIgnoreCase("minggu"))
			{
				System.out.println("MAAF KAMI LIBUR!");
				System.out.print("Pilih hari pemesanan :");
				System.out.print("");
				hari = sc.nextLine();
			}
		}
		while(!hari.equalsIgnoreCase("senin") && !hari.equalsIgnoreCase("selasa") && !hari.equalsIgnoreCase("rabu") && !hari.equalsIgnoreCase("kamis") && !hari.equalsIgnoreCase("jumat") && !hari.equalsIgnoreCase("sabtu"));
		
			System.out.print("masukkan jam pemesanan :");
			jam = sc.nextDouble();
			

			if(jam < 7 )
			{
				System.out.println("MAAF KAMI BELUM BUKA");
			}

			else if(jam >= 07.00 && jam < 12.00)
			{
				System.out.print(jam + (" pagi"));

				letaklapangan(letaklapangan);

				for(int i = 0; i < 4; i++)
				{
					for(int j = 0; j < 3; j++)
					{
						System.out.print(letaklapangan[i][j] + "\t");
					}
					System.out.println();
				}

				System.out.print("masukkan durasi jam pemesanan :");
				durasi = sc.nextDouble();

				if(durasi >= 1 )
				{
					System.out.println("============================================================");
					durasi2 = jam+durasi;
					System.out.print("\nWAKTU berakhir : \n"+durasi2+" PAGI");
					System.out.print("\n============================================================");

					durasi = durasi * 80000;
					System.out.print("\nHarga : Rp. "+durasi);

					System.out.print("\nMasukkan uang anda :\n ");
					harga = sc.nextDouble();

					if(harga<durasi)
					{
						System.out.print("Maaf uang anda tidak cukup");
					}
					else if(harga>durasi)
					{
						harga=harga-durasi;
						System.out.print("\nUang anda kembali : \n"+harga );
						System.out.println("\n---------------------------------------------------");
						System.out.print("Terimakasih telah memesan di tempat kami : "+pemesan);
						System.out.println("\n---------------------------------------------------");
					}
					else
					{
						System.out.println("\nAnda membayar dengan uang pas\n");
						System.out.println("-----------------------------------------------------");
						System.out.println("Terimakasih telah memesan di tempat kami  :" + pemesan);
						System.out.println("-----------------------------------------------------");
					}
				}
			}
			
			else if(jam >= 12.00 && jam < 18.00)	
			{
				System.out.print(jam + (" SIANG"));

				letaklapangan(letaklapangan);

				for(int i = 0; i < 3; i++)
				{
					for(int j = 0; j < 3; j++)
					{
						System.out.print(letaklapangan[i][j] + "\t");
					}
					System.out.println();
				}

				System.out.print("masukkan durasi jam pemesanan :");
				durasi = sc.nextDouble();

				if(durasi >= 1 )
				{
					System.out.println("=================================");
					durasi2 = jam+durasi;
					System.out.print("\nWAKTU berakhir : \n"+durasi2+" siang");
					System.out.print("\n============================================================");

					durasi = durasi * 80000;
					System.out.print("\nHarga : Rp. "+durasi);

					System.out.print("\nMasukkan uang anda :\n ");
					harga = sc.nextDouble();

					if(harga<durasi)
					{
						System.out.print("Maaf uang anda tidak cukup");
					}
					else if(harga>durasi)
					{
						harga=harga-durasi;
						System.out.print("\nUang anda kembali : \n"+harga );
						System.out.println("\n---------------------------------------------------");
						System.out.print("Terimakasih telah memesan di tempat kami : "+pemesan);
						System.out.println("\n---------------------------------------------------");
					}
					else
					{
						System.out.println("\nAnda membayar dengan uang pas\n");
						System.out.println("-----------------------------------------------------");
						System.out.println("Terimakasih telah memesan di tempat kami  :" + pemesan);
						System.out.println("-----------------------------------------------------");
					}
				}
			}
			else if(jam >= 18.00 && jam <= 23.00)
			{
				System.out.print(jam + (" MALAM"));

				letaklapangan(letaklapangan);

				for(int i = 0; i < 3; i++)
				{
					for(int j = 0; j < 3; j++)
					{
						System.out.print(letaklapangan[i][j] + "\t");
					}
					System.out.println();
				}
				
				System.out.print("Masukkan durasi jam pemesanan :");
				durasi = sc.nextDouble();

				if(durasi >= 1 )
				{
					System.out.println("=================================");
					durasi2 = jam + durasi;
					
					if(durasi2 > 24.00)
					{
						System.out.print("TERAKHIR JAM 12 MALAM");
					}
					else
					{
						System.out.print("\nWAKTU berakhir : \n"+durasi2+" MALAM");
					System.out.print("\n============================================================");

					durasi = durasi * 80000;
					System.out.print("\nHarga : Rp. "+durasi);

					System.out.print("\nMasukkan uang anda :\n ");
					harga = sc.nextDouble();

					if(harga<durasi)
					{
						System.out.print("Maaf uang anda tidak cukup");
					}
					else if(harga>durasi)
					{
						harga=harga-durasi;
						System.out.print("\nUang anda kembali : \n"+harga );
						System.out.println("\n---------------------------------------------------");
						System.out.print("Terimakasih telah memesan di tempat kami : "+pemesan);
						System.out.println("\n---------------------------------------------------");
					}
					else
					{
						System.out.println("\nAnda membayar dengan uang pas\n");
						System.out.println("-----------------------------------------------------");
						System.out.println("Terimakasih telah memesan di tempat kami  :" + pemesan);
						System.out.println("-----------------------------------------------------");
					}
				}
			}
					}	

								
				else if(jam > 23.00)
				{
					System.out.print("MAAF KAMI SUDAH TUTUP");
				}
	}

		static String[][] letaklapangan(String[][] letaklapangan)
		{
			Scanner sc = new Scanner(System.in);

			int b, k;
			String letaknya;

			System.out.println("");

			do
			{
				for(int i = 0; i < 4; i++)
				{
					for(int j = 0; j < 3; j++)
					{
						if(j == 0)
						{
							letaklapangan[i][j] = (i + 1) + "A";
						}	

						else if(j == 1)
						{
							letaklapangan[i][j] = (i + 1) + "B";
						}	
						else if(j == 2)
						{
							letaklapangan[i][j] = (i + 1) + "C";
						}	
						else 
						{
							letaklapangan[i][j] = (i + 1) + "D";
						}	
					}
				}

				for(int i = 0; i < 4; i++)
				{
					for(int j = 0; j < 3; j++)
					{
						System.out.print(letaklapangan[i][j] + "\t");
					}
					System.out.println();
				}

			
			
				System.out.print("pilih letak lapangan : ");
				letaknya = sc.nextLine();

				if(letaknya.equalsIgnoreCase("1A"))
				{
					b = 0;
					k = 0;
					letaklapangan[b][k] = "X";
				}	

				else if(letaknya.equalsIgnoreCase("2A"))
				{
					b = 1;
					k = 0;
					letaklapangan[b][k] = "X";
				}	

				else if(letaknya.equalsIgnoreCase("3A"))
				{
					b = 2;
					k = 0;
					letaklapangan[b][k] = "X";
				}	
				else if(letaknya.equalsIgnoreCase("4A"))
				{
					b = 3;
					k = 0;
					letaklapangan[b][k] = "X";
				}


				else if(letaknya.equalsIgnoreCase("1B"))
				{
					b = 0;
					k = 1;
					letaklapangan[b][k] = "X";
				}	

				if(letaknya.equalsIgnoreCase("2B"))
				{
					b = 1;
					k = 1;
					letaklapangan[b][k] = "X";
				}	

				else if(letaknya.equalsIgnoreCase("3B"))
				{
					b = 2;
					k = 1;
					letaklapangan[b][k] = "X";
				}	
				else if(letaknya.equalsIgnoreCase("4B"))
				{
					b = 3;
					k = 1;
					letaklapangan[b][k] = "X";
				}	


				else if(letaknya.equalsIgnoreCase("1C"))
				{
					b = 0;
					k = 2;
					letaklapangan[b][k] = "X";
				}	

				else if(letaknya.equalsIgnoreCase("2C"))
				{
					b = 1;
					k = 2;
					letaklapangan[b][k] = "X";
				}	

				else if(letaknya.equalsIgnoreCase("3C"))
				{
					b = 2;
					k = 2;
					letaklapangan[b][k] = "X";
				}	
				else if(letaknya.equalsIgnoreCase("4C"))
				{
					b = 3;
					k = 2;
					letaklapangan[b][k] = "X";
				}	
				else if(letaknya.equalsIgnoreCase("1D"))
				{
					b = 0;
					k = 3;
					letaklapangan[b][k] = "X";
				}
				else if(letaknya.equalsIgnoreCase("2D"))
				{
					b = 1;
					k = 3;
					letaklapangan[b][k] = "X";
				}	
				else if(letaknya.equalsIgnoreCase("3D"))
				{
					b = 2;
					k = 3;
					letaklapangan[b][k] = "X";
				}
					else if(letaknya.equalsIgnoreCase("4D"))
				{
					b = 3;
					k = 3;
					letaklapangan[b][k] = "X";
				}		
			}
			while(!letaknya.equalsIgnoreCase("1A") && !letaknya.equalsIgnoreCase("2A") && !letaknya.equalsIgnoreCase("3A") && !letaknya.equalsIgnoreCase("1B") && !letaknya.equalsIgnoreCase("2B") && !letaknya.equalsIgnoreCase("3B") && !letaknya.equalsIgnoreCase("1C") && !letaknya.equalsIgnoreCase("2C") && !letaknya.equalsIgnoreCase("3C") && !letaknya.equalsIgnoreCase("4A") && !letaknya.equalsIgnoreCase("4B") && !letaknya.equalsIgnoreCase("4C"));
		return letaklapangan;
		} 
}