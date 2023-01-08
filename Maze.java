public class Maze {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Создаем лабиринт из двумерного массива из 8 строк и столбцов
        char[][] map = new char[15][15];
        Pri(map);
    }

    public static void Pri(char[][] map) {
        // Выводим исходный массив
        initMap(map);
        System.out.println("_______________________________");
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        // Путь 1
        setWay1(map, 1, 1);
        // Определим, есть ли путь
        boolean isExist = false;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if ('O' == map[i][j]) {
                    isExist = true;
                }
            }
        }

        // Путь для выхода 1
        if (isExist == true) {
            System.out.println("_______________________________");
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Не существует пути 1");
        }
        System.out.println();

        // Путь 2
        initMap(map);
        setWay2(map, 1, 1);
        // Путь для выхода 2
        if (isExist == true) {
            System.out.println("_______________________________");
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Не существует пути 2");
        }
        System.out.println();

        // Путь 3
        initMap(map);
        setWay3(map, 1, 1);
        // Путь для выхода 2
        if (isExist == true) {
            System.out.println("_______________________________");
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Не существует пути 3");
        }
        System.out.println();

        // Путь 4
        initMap(map);
        setWay4(map, 1, 1);
        // Путь для выхода 2
        System.out.println("_______________________________");
        if (isExist == true) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Не существует пути 4");
        }

    }

    // Путь 1:
    public static boolean setWay1(char[][] map, int i, int j) {
        if (map[13][13] == 'O') {
            return true;
        } else {
            if (map[i][j] == ' ') {
                map[i][j] = 'O';
                // Вниз
                if (setWay1(map, i + 1, j)) {
                    return true;
                }
                // Вправо
                else if (setWay1(map, i, j + 1)) {
                    return true;
                }
                // Вверх
                else if (setWay1(map, i - 1, j)) {
                    return true;
                }
                // Влево
                else if (setWay1(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 'X';
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    // Путь 2:
    public static boolean setWay2(char[][] map, int i, int j) {
        if (map[13][13] == 'O') {
            return true;
        } else {
            if (map[i][j] == ' ') {
                map[i][j] = 'O';
                // Вправо
                if (setWay2(map, i, j + 1)) {
                    return true;
                }
                // Вниз
                else if (setWay2(map, i + 1, j)) {
                    return true;
                }
                // Влево
                else if (setWay2(map, i, j - 1)) {
                    return true;
                }
                // Вверх
                else if (setWay2(map, i - 1, j)) {
                    return true;
                } else {
                    map[i][j] = 'X';
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    // Путь 3:
    public static boolean setWay3(char[][] map, int i, int j) {
        if (map[13][13] == 'O') {
            return true;
        } else {
            if (map[i][j] == ' ') {
                map[i][j] = 'O';
                // Вправо
                if (setWay3(map, i, j + 1)) {
                    return true;
                }
                // Влево
                else if (setWay3(map, i, j - 1)) {
                    return true;
                }
                // Вверх
                else if (setWay3(map, i - 1, j)) {
                    return true;
                }
                // Ввниз
                else if (setWay3(map, i + 1, j)) {
                    return true;
                } else {
                    map[i][j] = 'X';
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    // Путь 4:
    public static boolean setWay4(char[][] map, int i, int j) {
        if (map[13][13] == 'O') {
            return true;
        } else {
            if (map[i][j] == ' ') {
                map[i][j] = 'O';
                // Вниз
                if (setWay1(map, i + 1, j)) {
                    return true;
                }
                // Влево
                else if (setWay1(map, i, j - 1)) {
                    return true;
                }
                // Вверх
                else if (setWay1(map, i - 1, j)) {
                    return true;
                }
                // Вправо
                else if (setWay1(map, i, j + 1)) {
                    return true;
                }
                else {
                    map[i][j] = 'X';
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public static void initMap(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = ' ';
            }
        }

        // стена
        for (int i = 0; i < map.length; i++) {
            map[0][i] = '_';
            map[map.length - 1][i] = '_';
        }
        for (int i = 0; i < map.length; i++) {
            map[i][0] = '_';
            map[i][map.length - 1] = '_';
        }

        map[1][5] = '*';
        map[2][1] = '*';
        map[2][4] = '*';
        map[2][5] = '*';
        map[2][6] = '*';
        map[2][8] = '*';
        map[3][2] = '*';
        map[3][9] = '*';
        map[3][12] = '*';
        map[4][5] = '*';
        map[4][6] = '*';
        map[4][12] = '*';
        map[5][1] = '*';
        map[5][2] = '*';
        map[5][3] = '*';
        map[5][4] = '*';
        map[5][5] = '*';
        map[5][6] = '*';
        map[5][11] = '*';
        map[6][7] = '*';
        map[6][12] = '*';
        map[7][2] = '*';
        map[7][7] = '*';
        map[7][11] = '*';
        map[9][3] = '*';
        map[9][4] = '*';
        map[9][5] = '*';
        map[9][6] = '*';
        map[9][7] = '*';
        map[10][7] = '*';
        map[10][10] = '*';
        map[11][4] = '*';
        map[11][7] = '*';
        map[11][8] = '*';
        map[11][9] = '*';
        map[13][9] = '*';
        map[13][10] = '*';
    }
}