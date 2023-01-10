//00:24:43
function solution(case1) {
  const input = case1.split("\n");
  const [Y, ...P] = input.map((data) => data.split(" ").map(Number));
  const position = [
    [0, 1, 2],
    [0, 2, 1],
    [1, 0, 2],
    [1, 2, 0],
    [2, 0, 1],
    [2, 1, 0],
  ];
  let answer = [];
  for (let i = 0; i < position.length; i++) {
    let start = [...Y];
    let sum = 0;
    for (let j = 0; j < position[i].length; j++) {
      const x = (start[0] - P[position[i][j]][0]) ** 2;
      const y = (start[1] - P[position[i][j]][1]) ** 2;
      const distance = Math.sqrt(x + y);
      start = P[position[i][j]];
      sum += distance;
    }
    answer.push(sum);
  }
  answer = Math.min(...answer);
  return parseInt(answer);
}

const case1 = `0 0
1 0
2 0
4 0`;

console.log(solution(case1));
