public class AudioPlayer implements MediaPlayer {
   MediaAdapter mediaAdapter; 

   @Override
   public void playMusic(String audioType, String fileName) {		

      if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("Playing mp3 file " + fileName);			
      } 
      
  
      else{
         System.out.println("Audio type not supported for the file" +filename);
      }
   }   
}
