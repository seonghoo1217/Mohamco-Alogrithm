//00:52:46
function solution(case1) {
  const [n, ...arr] = case1.split("\n");
  const N = Number(n);
  const BOARD = arr.map((v) => v.split(" ").map(Number));
  let isVisited = Array.from(Array(N), () => new Array(N).fill(false));
  isVisited[0][0] = true;
  let queue = [];
  queue.push([0, 0]);
  let answer = "Hing";

  while (queue.length) {
    let [x, y] = queue.shift();
    let visit = BOARD[x][y];
    if (visit == -1) {
      answer = "HaruHaru";
      break;
    }
    if (x + visit < N && !isVisited[x + visit][y]) {
      queue.push([x + visit, y]);
      isVisited[x + visit][y] = true;
    }
    if (y + visit < N && !isVisited[x][y + visit]) {
      queue.push([x, y + visit]);
      isVisited[x][y + visit] = true;
    }
  }
  return answer;
}

const case1 = `3
1 1 10
1 5 1
2 2 -1`;

console.log(solution(case1));
