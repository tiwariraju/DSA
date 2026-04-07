class Robot {
    int x, y;
    int m, n;
    char dir;
    int perimeter;

    public Robot(int width, int height) {
        x = 0;
        y = 0;
        m = width;
        n = height;
        dir = 'E';
        perimeter = 2 * (m + n) - 4;
    }
    
    public void step(int num) {
        num = num % perimeter;

        if(num == 0) {
            if(x == 0 && y == 0) {
                dir = 'S';
            }
            return;
        }

        while(num > 0) {
            if(dir == 'E') {
                int move = Math.min(num, m - 1 - x);
                x += move;
                num -= move;
                if(num > 0) dir = 'N';
            }
            if(dir == 'N') {
                int move = Math.min(num, n - 1 - y);
                y += move;
                num -= move;
                if(num > 0) dir = 'W';
            }
            if(dir == 'W') {
                int move = Math.min(num, x);
                x -= move;
                num -= move;
                if(num > 0) dir = 'S';
            }
            if(dir == 'S') {
                int move = Math.min(num, y);
                y -= move;
                num -= move;
                if(num > 0) dir = 'E';
            }
        }
    }
    
    public int[] getPos() {
        return new int[]{x, y};
    }
    
    public String getDir() {
        if(dir == 'E') return "East";
        if(dir == 'W') return "West";
        if(dir == 'N') return "North";
        return "South";
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */