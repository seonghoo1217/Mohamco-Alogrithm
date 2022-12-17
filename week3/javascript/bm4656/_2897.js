//01:34:22
function solution(data) {
  let input = data.toString().trim().split('\n');
  const [R, C] = input[0].split(' ').map(Number);
  let p = [];
  let result = [0, 0, 0, 0, 0];
  for (let i = 1; i < input.length; i++) {
    p.push(input[i].split(''));
  }

  for (let i = 0; i < R; i++) {
    for (let j = 0; j < C; j++) {
      if (i < R - 1 && j < C - 1) {
        let tmp = 0;
        if (
          p[i][j] == '#' ||
          p[i][j + 1] == '#' ||
          p[i + 1][j] == '#' ||
          p[i + 1][j + 1] == '#'
        ) {
          continue;
        }
        if (p[i][j] == 'X') {
          tmp++;
        }
        if (p[i][j + 1] == 'X') {
          tmp++;
        }
        if (p[i + 1][j] == 'X') {
          tmp++;
        }
        if (p[i + 1][j + 1] == 'X') {
          tmp++;
        }
        result[tmp]++;
      }
    }
  }
  return result.join('\n');
}

const case1 = `4 4
#..#
..X.
..X.
#XX#`;

console.log(solution(case1));
