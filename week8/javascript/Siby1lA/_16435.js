//00:12:40
function solution(case1) {
  const input = case1.split("\n");
  let [N, L] = input[0].split(" ").map(Number);
  let arr = input[1]
    .split(" ")
    .map(Number)
    .sort((a, b) => a - b);
  arr.forEach((fruit) => {
    if (L < fruit) {
      return;
    }
    if (L >= fruit) {
      L++;
    }
  });
  return L;
}
const case1 = `9 1
9 5 8 1 3 2 7 6 4
`;

console.log(solution(case1));
