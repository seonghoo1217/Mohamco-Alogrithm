//00:45:04
function solution(case1) {
  const BOARD = case1.split("\n").map((v) => v.split(" ").map(Number));
  const DIR = [
    [1, 0],
    [-1, 0],
    [0, -1],
    [0, 1],
  ];
  const answer = [];

  function DFS(x, y, str = "") {
    if (str.length === 6) {
      answer.push(str);
      return;
    } else {
      DIR.forEach((val) => {
        const [a, b] = val;
        let ddx = x + a;
        let ddy = y + b;
        if (ddx >= 0 && ddx < 5 && ddy >= 0 && ddy < 5) {
          DFS(ddx, ddy, str + BOARD[ddx][ddy]);
        }
      });
    }
  }

  for (let i = 0; i < 5; i++) {
    for (let j = 0; j < 5; j++) {
      DFS(i, j);
    }
  }

  return [...new Set(answer)].length;
}

const case1 = `1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 2 1
1 1 1 1 1`;

console.log(solution(case1));
