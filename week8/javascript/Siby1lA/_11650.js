//00:06:39
function solution(case1) {
  const input = case1.split("\n");
  const N = input.shift();
  const arr = input.map((data) => data.split(" ").map(Number));
  let answer = "";
  arr
    .sort((a, b) => {
      if (a[0] !== b[0]) {
        return a[0] - b[0];
      }
      return a[1] - b[1];
    })
    .forEach((data) => {
      answer += `${data[0]} ${data[1]}\n`;
    });
  return answer.trim("");
}
const case1 = `5
3 4
1 1
1 -1
2 2
3 3`;

console.log(solution(case1));
