//00:14:09
function solution(case1) {
  const input = case1.split("\n");
  const [n, ...S] = input;
  const [N, C] = n.split(" ").map(Number);
  let count = 0;
  for (let i = 0; i < C; i++) {
    for (let j = 0; j < N; j++) {
      if (i % S[j] === 0) {
        count += 1;
        break;
      }
    }
  }
  return count;
}
const case1 = `2 20
4
6`;

console.log(solution(case1));
