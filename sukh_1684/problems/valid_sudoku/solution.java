class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> a= new HashSet<Character>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(a.contains(board[i][j]) && board[i][j]!='.'){
                return false;
                }
            
            else{
                a.add(board[i][j]);
            }
        }
            a.clear();
        
    }
                for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(a.contains(board[j][i]) && board[j][i]!='.'){
                    System.out.println("f2");
                return false;
                }
            
            else{
                a.add(board[j][i]);
            }
        }
            a.clear();
        
    }
   Set<Character> [] boxes = new HashSet[9];
        for(int i=0;i<9;i++){
            boxes[i]=new HashSet<Character>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
              int box_index=(i/3)*3+j/3;
                if(boxes[box_index].contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                    
                }
                else{
                    boxes[box_index].add(board[i][j]);
                }
            }
            
        }
      return true;
    }
}