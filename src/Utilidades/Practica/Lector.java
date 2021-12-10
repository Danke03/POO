package Utilidades.Practica;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Lector {
		
			private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			// Constructor.
			private Lector()
			{
				super();
			}
			
			public static byte leerByte()
			{
				byte tmp = 0;
				try 
				{
					tmp = Byte.parseByte(br.readLine());
				}
				catch (NumberFormatException ex) 
				{
					System.out.println("Error: el dato introducido no se puede convertir en un byte.");
					ex.printStackTrace();
				}
				catch (IOException ex) 
				{
					System.out.println("Error: hubo un problema en la operación de entrada de datos.");
					ex.printStackTrace();
				}
				catch(Exception ex)
				{
					System.out.println("Error: hubo un problema no controlado.");
					ex.printStackTrace();
				}
				return tmp;
			}
			
			
			public static short leerShort()
			{
				short tmp = 0;
				try 
				{
					tmp = Short.parseShort(br.readLine());
				}
				catch (NumberFormatException ex) 
				{
					System.out.println("Error: el dato introducido no se puede convertir en un short.");
					ex.printStackTrace();
				}
				catch (IOException ex) 
				{
					System.out.println("Error: hubo un problema en la operación de entrada de datos.");
					ex.printStackTrace();
				}
				catch(Exception ex)
				{
					System.out.println("Error: hubo un problema no controlado.");
					ex.printStackTrace();
				}
				return tmp;
			}
			
			
			public static char leerChar()
			{
				char tmp = ' ';
				try 
				{
					tmp = br.readLine().charAt(0);
				}
				catch (IOException ex) 
				{
					System.out.println("Error: hubo un problema en la operación de entrada de datos.");
					ex.printStackTrace();
				}
				catch(Exception ex)
				{
					System.out.println("Error: hubo un problema no controlado.");
					ex.printStackTrace();
				}
				return tmp;
			}
			
			
			public static int leerInt()
			{
				int tmp = 0;
				try 
				{
					tmp = Integer.parseInt(br.readLine());
				}
				catch (NumberFormatException ex) 
				{
					System.out.println("Error: el dato introducido no se puede convertir en un int.");
					ex.printStackTrace();
				}
				catch (IOException ex) 
				{
					System.out.println("Error: hubo un problema en la operación de entrada de datos.");
					ex.printStackTrace();
				}
				catch(Exception ex)
				{
					System.out.println("Error: hubo un problema no controlado.");
					ex.printStackTrace();
				}
				return tmp;
			}
			
			
			public static long leerLong()
			{
				long tmp = 0;
				try 
				{
					tmp = Long.parseLong(br.readLine());
				}
				catch (NumberFormatException ex) 
				{
					System.out.println("Error: el dato introducido no se puede convertir en un long.");
					ex.printStackTrace();
				}
				catch (IOException ex) 
				{
					System.out.println("Error: hubo un problema en la operación de entrada de datos.");
					ex.printStackTrace();
				}
				catch(Exception ex)
				{
					System.out.println("Error: hubo un problema no controlado.");
					ex.printStackTrace();
				}
				return tmp;
			}
			
			
			public static float leerFloat()
			{
				float tmp = 0;
				try 
				{
					tmp = Float.parseFloat(br.readLine());
				}
				catch (NumberFormatException ex) 
				{
					System.out.println("Error: el dato introducido no se puede convertir en un float.");
					ex.printStackTrace();
				}
				catch (IOException ex) 
				{
					System.out.println("Error: hubo un problema en la operación de entrada de datos.");
					ex.printStackTrace();
				}
				catch(Exception ex)
				{
					System.out.println("Error: hubo un problema no controlado.");
					ex.printStackTrace();
				}
				return tmp;
			}
			
			
			public static double leerDouble()
			{
				double tmp = 0;
				try 
				{
					tmp = Double.parseDouble(br.readLine());
				}
				catch (NumberFormatException ex) 
				{
					System.out.println("Error: el dato introducido no se puede convertir en un double.");
					ex.printStackTrace();
				}
				catch (IOException ex) 
				{
					System.out.println("Error: hubo un problema en la operación de entrada de datos.");
					ex.printStackTrace();
				}
				catch(Exception ex)
				{
					System.out.println("Error: hubo un problema no controlado.");
					ex.printStackTrace();
				}
				return tmp;
			}
			
			
			public static String leerString()
			{
				String tmp = null;
				try 
				{
					tmp = br.readLine();
				}
				catch (IOException ex) 
				{
					System.out.println("Error: hubo un problema en la operación de entrada de datos.");
					ex.printStackTrace();
				}
				catch(Exception ex)
				{
					System.out.println("Error: hubo un problema no controlado.");
					ex.printStackTrace();
				}
				return tmp;
			}
			
			public static boolean leerBoolean()
			{
				boolean tmp = false;
				try 
				{
					tmp = new Boolean(br.readLine()).booleanValue();
				}
				catch (IOException ex) 
				{
					System.out.println("Error: hubo un problema en la operación de entrada de datos.");
					ex.printStackTrace();
				}
				catch(Exception ex)
				{
					System.out.println("Error: hubo un problema no controlado.");
					ex.printStackTrace();
				}
				return tmp;
			}
			

	}


