//00:16:20
function solution(data) {
  let [N, ...input] = data.trim().split('\n');
  let result = '';
  input = input.map(i => i.split(' ').map(Number));
  input
    .sort((a, b) => {
      if (a[0] !== b[0]) {
        return a[0] - b[0];
      }
      return a[1] - b[1];
    })
    .forEach(e => {
      result += `${e[0]} ${e[1]}\n`;
    });
  return result;
}

const case1 = `5
3 4
1 1
1 -1
2 2
3 3`;

console.log(solution(case1));
