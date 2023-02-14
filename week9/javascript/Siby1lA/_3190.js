//00:25:00
function solution(case1) {
  const input = case1.split("\n");
  const N = +input.shift();
  let board = Array.from(Array(N), () => Array(N).fill(0));
  board[0][0] = "X";
  const breakPoint = [];
  const snake = [[0, 0]];

  const A = +input.shift();
  for (let i = 0; i < A; i++) {
    const [x, y] = input.shift().split(" ").map(Number);
    board[x - 1][y - 1] = "A";
  }

  const d = +input.shift();
  for (let i = 0; i < d; i++) {
    breakPoint.push(
      input
        .shift()
        .split(" ")
        .map((v, i) => {
          if (i == 0) return +v;
          else return v;
        })
    );
  }

  const dirSet = {
    R: [0, 1],
    L: [0, -1],
    D: [1, 0],
    U: [-1, 0],
  };

  let dir = "R";
  let time = 0;
  while (true) {
    time++;
    const [x, y] = snake[snake.length - 1]; //head
    const nx = x + dirSet[dir][0];
    const ny = y + dirSet[dir][1];
    if (nx >= 0 && ny >= 0 && nx < N && ny < N && board[nx][ny] != "X") {
      snake.push([nx, ny]);
      if (board[nx][ny] != "A") {
        const [px, py] = snake.shift();
        board[px][py] = 0;
      }
      board[nx][ny] = "X";
    } else {
      break;
    }
    if (breakPoint.length > 0 && time == breakPoint[0][0]) {
      const [_, changeDir] = breakPoint.shift();
      switch (dir) {
        case "R":
          if (changeDir == "L") dir = "U";
          else dir = "D";
          break;
        case "L":
          if (changeDir == "L") dir = "D";
          else dir = "U";
          break;
        case "U":
          if (changeDir == "L") dir = "L";
          else dir = "R";
          break;
        case "D":
          if (changeDir == "L") dir = "R";
          else dir = "L";
          break;
      }
    }
  }
  return time;
}

const case1 = `10
4
1 2
1 3
1 4
1 5
4
8 D
10 D
11 D
13 L`;

console.log(solution(case1));
