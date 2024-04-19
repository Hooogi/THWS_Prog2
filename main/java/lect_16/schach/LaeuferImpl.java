package lect_16.schach;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder()
  {
    Brett brett = new Brett();
    int max;

    if(this.x >= this.y){
      max = this.x;
    }
    else{
      max = this.y;
    }

    int pos_x = this.x + (8-max);
    int pos_y = this.y + (8-max);

    for(int i = 0; pos_x-i >=1 && pos_y-i >=1; i++){
      brett.markiereFeld(pos_x-i,pos_y-i);
    }

    if((this.y-1)>(8-this.x)){
      pos_x = this.x + (8-this.x);
      pos_y = this.y - (8-this.x);
    }
    else{
      pos_x = this.x + (this.y-1);
      pos_y = this.y - (this.y-1);
    }

    for(int i = 0; pos_x-i >=1 && pos_y+i <= 8; i++){
      brett.markiereFeld(pos_x-i,pos_y+i);
    }

    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(2,3 );
    Brett brett = l.gibErlaubteFelder();
    for (int j = 1; j <= 8; j++)
    {
      for (int i = 1; i <= 8; i++)
      {
        if (brett.gibFeld(i, j)) System.out.print("x");
        else System.out.print("o");
      }
      System.out.println();
    }
  }
}
