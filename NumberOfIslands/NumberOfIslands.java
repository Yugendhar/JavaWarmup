package NumberOfIslands;


//Horizontal , Vertical and Including Diagonal -Group them as one Island

public class NumberOfIslands {

private int n;
private int m;

public int numIslands(char[][] grid) {
    int count = 0;
    n = grid.length;
    if (n == 0) return 0;
    m = grid[0].length;
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++)
            if (grid[i][j] == '1') {
                DFSMarking(grid, i, j);
                ++count;
            }
    }    
    return count;
}

private void DFSMarking(char[][] grid, int i, int j) {
	
    if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
    grid[i][j] = '0';
    DFSMarking(grid, i + 1, j);
    DFSMarking(grid, i - 1, j);
    DFSMarking(grid, i, j + 1);
    DFSMarking(grid, i, j - 1);
    DFSMarking(grid, i+1, j + 1);
    DFSMarking(grid, i-1, j + 1);
    DFSMarking(grid, i+1, j -1);
    DFSMarking(grid, i-1, j -1);
}

public static void main(String[] args)
{
	
NumberOfIslands s= new NumberOfIslands();
String[] input= {"0000001110",
 "0000000000",
 "1000010000",
 "1000000110",
 "1000000110",
 "1000100000",
 "0001000001"};
char[][] charray= new char[input.length][];
for(int i=0;i<input.length;i++)
{ 
	charray[i]=input[i].toCharArray();
}

		 
int c= s.numIslands(charray);
System.out.println(c);
}
}