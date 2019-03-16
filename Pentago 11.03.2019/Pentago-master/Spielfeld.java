Spielfeld(mC Pentago){
  meinChef = mC;
  feld = DreiMalDrei[2][2];
}

turn(boolean cw, int x, int y){
    for ( i = 0, i < 2, i ++){
      for ( j = 0, j < 2, j ++){
        if ( feld[i][j].x == x && feld[i][j].y == y){
          feld[i][j].turn(cw);
        }
      }
    }
}
