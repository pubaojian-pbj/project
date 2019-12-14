#!/usr/bin/env python
import os
import sys

machines = [
    # add your machine list here.
    # format: "user1@hostname1", "user2@hostname2", ...
    # don't forget to add public key before using it
    ('zhuli@172.27.128.35', 'pce-gpu01'),
    ('root@172.27.129.29', 'baseline-330cdh'),
    ('root@172.27.129.35', 'baseline-unstable-intelligence'),
    ('root@172.27.128.8', 'qatest-k8s128008'),
    ('root@172.27.128.70', 'baseline-unstable-cdh'),
    ('root@172.27.129.202', 'baseline-unstable-pdms-cdh'),
    ('root@172.27.129.205', 'baseline-unstable-pdms-fi'),
    ('root@172.27.128.148', 'power-gpu-128148'),
    ('root@172.27.128.190', 'qatest-autoui'),
    ('root@172.27.128.191', 'qatest-ssd01'),
    ('root@172.27.128.192', 'baseline-unstable-fi'),
    ('root@172.27.140.200', 'baseline-200'),
    ('root@172.27.140.201', 'baseline-201'),
    ('root@172.27.128.149', 'qa-gpu01'),
    ('root@172.27.193.7', 'leap-node7'),
    ('root@172.27.128.124', 'common-cdh07'),
    ('root@172.27.128.189', 'node189'),
    ('root@172.27.140.100', 'baseline-100'),
    ('root@172.27.128.187', 'uiauto-001'),
    ('root@172.27.193.32', 'node-8gpu'),
    ('root@172.27.137.239', 'demo-239'),
    ('root@172.27.128.85', 'model-test02'),
    ('root@172.27.193.1', 'leap-node1'),
]

def show_machines():
    for idx, val in enumerate(machines):
        print('%3d %s' % (idx + 1, val))

def goto_machine(idx):
    if idx < 1 or idx > len(machines):
        print('Invalid index.')
        return
    os.system('ssh %s' % machines[idx - 1][0])

def main():
    if len(sys.argv) <= 1:
        show_machines()
        return
    idx = int(sys.argv[1])
    goto_machine(idx)

if __name__ == '__main__':
    main()



#gp

gp() 
{
    if [ $# -lt 1 ]; then
        return
    elif [ $# -eq 1 ]; then
        keyword=$1
        grep -Irn "$keyword" .
    else
        keyword=$1
        n=$2
        f=$(grep -Irn "$keyword" . | awk -F":" 'NR=='"$n"' {print $1 " +" $2}')
        vi $f
    fi  
}
export -f gp
