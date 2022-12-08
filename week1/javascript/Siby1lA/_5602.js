// 01:20:53
function solution(n, m, enqute) {
  let total = 0;
  let result = [];
  let arr = Array.from({ length: m }, (_value, index) => index + 1);
  for (let i = 0; i < m; i++) {
    for (let j = 0; j < n; j++) {
      total += enqute[j][i];
    }
    result.push(total);
    total = 0;
  }
  const totalObject = Object.assign({}, arr, result);
  let answer = Object.entries(totalObject)
    .sort((a, b) => {
      if (a[1] === b[1]) return a[0] < b[0] ? -1 : 1;
      return b[1] - a[1];
    })
    .map((rank) => Number(rank[0]) + 1);
  return answer;
}
let n = 4;
let m = 6;
let enqute = [
  [1, 0, 1, 0, 1, 1],
  [1, 1, 0, 1, 0, 0],
  [1, 1, 1, 0, 0, 0],
  [1, 0, 1, 0, 1, 0],
];
console.log(solution(n, m, enqute));
