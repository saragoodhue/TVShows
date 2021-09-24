import java.util.ArrayList;
public class ProgramRunner
	{

		static ArrayList<TVShows> program = new ArrayList<TVShows>();
		public static void main(String[] args)
			{
				
				
				program.add(new TVShows("Friends", "Comedy", 10));
				program.add(new TVShows("Grey's Anatomy", "Drama", 18));
				program.add(new TVShows("Criminal Minds", "Drama", 12));
				program.add(new TVShows("You", "Drama", 3));
				program.add(new TVShows("Vampire Diaries", "Drama", 8));
				
				printList();
				newSeasonsAired();
				printList();
				deleteLongestTitle();
				changeFirstTitle();
				printList();

			}
		
		public static void printList()
			{
				for(int i = 0; i < program.size(); i++)
					{
						System.out.println(program.get(i).getTitle());
						System.out.println(program.get(i).getGenre());
						System.out.println(program.get(i).getNumberOfSeasonsAired());
						
					}
				System.out.println();
			}
		
		
		public static void deleteLongestTitle()
			{
				int longestTitle = Integer.MIN_VALUE;
				
				for(int i = 0; i < program.size(); i++)
					{
						if(program.get(i).getTitle().length() > longestTitle)
							{
								longestTitle = program.get(i).getTitle().length();
							}
					}
				
				for(int i = 0; i < program.size(); i++)
					{
						if(program.get(i).getTitle().length() < longestTitle)
							{
								System.out.println(program.get(i).getTitle());
								System.out.println(program.get(i).getGenre());
								System.out.println(program.get(i).getNumberOfSeasonsAired());	

							}

					}
				System.out.println();

			}
		
		public static void newSeasonsAired()
			{
				for(int i = 0; i < program.size(); i++)
					{
						program.get(i).setNumberOfSeasonsAired(program.get(i).getNumberOfSeasonsAired() + 1);
						
						
					}
				System.out.println();
			}
		
		public static void changeFirstTitle()
			{
				program.get(0).setTitle(0, "Money Heist");
			}

	}
