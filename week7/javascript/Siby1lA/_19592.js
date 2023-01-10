//00:33:34
function solution(case1) {
  const input = case1.split("\n");
  const [T, ...test] = input;
  let answer = "";
  for (let i = 0; i < T; i++) {
    const [N, X, Y] = test.shift().split(" ").map(Number);
    const V = test.shift().split(" ").map(Number);
    let max = Math.max(...V);
    if (max === V[N - 1] && V.filter((v) => v === max).length === 1) {
      answer += "0\n";
      continue;
    }
    let lt = 0;
    let rt = Y;
    const min = X - V[N - 1] * (X / max - 1);
    if (rt <= min) {
      answer += "-1\n";
      continue;
    }
    let mid = Math.floor((lt + rt) / 2);
    while (lt <= rt) {
      mid = Math.floor((lt + rt) / 2);
      if (mid <= min) lt = mid + 1;
      else rt = mid - 1;
    }
    answer += `${lt}\n`;
  }
  return answer.trim();
}
const case1 = `5
3 12 11
3 2 1
3 12 9
3 2 1
3 12 10
3 4 5
3 80 80
80 60 70
3 80 80
70 50 60`;

console.log(solution(case1));
