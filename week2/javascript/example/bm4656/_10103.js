//00:15:23
function solution(input) {
  let arr = input.split('\n');
  let score = [100, 100];
  const round = arr[0];
  for (let i = 1; i < arr.length; i++) {
    const [cy, sd] = arr[i].split(' ');
    if (cy > sd) {
      score[1] = score[1] - cy;
    } else if (cy < sd) {
      score[0] = score[0] - sd;
    }
  }
  return score.join('\n');
}

const input = `4
5 6
6 6
4 3
5 2`;

console.log(solution(input));
