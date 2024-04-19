package lect_16.schach;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }

  public Brett kombiniere(Brett secondBrett){
    Brett combinedBrett = new Brett();
    for(int i = 0; i<this.brett.length; i++){
      for(int j = 0; j<this.brett[i].length; j++){
        if(secondBrett.brett[i][j] || this.brett[i][j]){
          combinedBrett.brett[i][j]=true;
        }
      }
    }
    return combinedBrett;
  }
}
