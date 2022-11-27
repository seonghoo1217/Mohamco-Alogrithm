//00:08:03
function solution(string) {
  let input = string.split('\n');

  let cutPerson = input[0].split(' ').map(Number)[1];
  let score = input[1].split(' ').map(Number);

  score.sort((a, b) => b - a);
  const cutLine = score[cutPerson - 1];
  return cutLine;
}

let string = `5 2
100 76 85 93 98`;

console.log(solution(string));
